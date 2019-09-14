import axios from 'axios';

const baseURL = "http://192.168.2.160:8080/";

const api = axios.create({
    baseURL: baseURL,
    headers: { 'Content-Type': 'application/json' }
});


class Api {
    constructor(entityName) {
        this.entityName = entityName;
    }


    getAll = () => {
        return api.request({ method: 'get', url: `/${this.entityName}` });
    }
    getById = (id) => {
        return api.request({ method: 'get', url: `/${this.entityName}/${id}` });
    }

    save = (bodyRequest) => {
        return api.request({ method: 'post', url: `/${this.entityName}`, data: bodyRequest });
    }

    delete = (id) => {
        return api.request({ method: 'delete', url: `/${this.entityName}/${id}` });
    }

    post = (url, bodyRequest) => {
        return api.request({ method: 'post', url: url, data: bodyRequest });
    }

    put = (url, bodyRequest) => {
        return api.request({ method: 'put', url: url, data: bodyRequest });
    }

    get = (url) => {
        return api.request({ method: 'get', url: url });
    }
}


export const apiPost = () => {
    return new Api('post');
}