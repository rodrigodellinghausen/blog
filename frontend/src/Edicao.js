import React, { useState, useEffect } from 'react';
import { Button, Form, FormGroup, Label, Input, FormText } from 'reactstrap';
import { apiPost } from './Api'; 

const Edicao = props => {

    const [post, setPost] = useState({
        id: null,
        titulo: "",
        subtitulo: "",
        texto: "",
        autor: "",
        fonte: "",
        imagem: "",
        comentarios: [],
        dataCriacao: null
    });

    const onChangeField = (event) => {
        const newPost = { ...post };
        const { name, value } = event.currentTarget;

        newPost[name] = value;

        setPost(newPost);
    };

    const save = (ev) => {
        ev.preventDefault();
        ev.stopPropagation();

        console.log(post);

        post.comentarios = [];
        post.comentarios.push({
            autor: "Hacker",
            texto: "Deixe seu comentário aqui",
            status: "aguarda"
        });
        
        apiPost().save(post).then( (response) => {
            let _post = response.data;
            if (_post) {
               setPost(_post)
            }
        }).catch(e => {
            console.log("Erro: "+ e);
        });
    }

    return(
        <Form>
            
            <Input type="hidden" name="id" id="id" value={post.id} />
            
            <Label for="titulo">Titulo</Label>
            <Input type="text" name="titulo" id="titulo" value={post.titulo} onChange={onChangeField} />

            <Label for="subtitulo">subtitulo</Label>
            <Input type="text" name="subtitulo" id="subtitulo" value={post.subtitulo} onChange={onChangeField} />
            
            <Label for="texto">texto</Label>
            <Input type="textarea" name="texto" id="texto" value={post.texto} onChange={onChangeField} />

            <Label for="autor">autor</Label>
            <Input type="text" name="autor" id="autor" value={post.autor} onChange={onChangeField} />
            
            <Label for="fonte">fonte</Label>
            <Input type="text" name="fonte" id="fonte" value={post.fonte} onChange={onChangeField} />

            <Label for="imagem">imagem</Label>
            <Input type="text" name="imagem" id="imagem" value={post.imagem} onChange={onChangeField} />

            <Button onClick={ save }>Salvar</Button>
        </Form>
    );
} 

export default Edicao;