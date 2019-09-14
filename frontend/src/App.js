import React from 'react';
import { Switch, Route} from 'react-router-dom';
import './App.css';

import Blog from './Blog';
import Edicao from './Edicao';

function App() {
  return (
    <Switch>
        <Route path='/edicao' component={Edicao} />
        <Route path='/blog' component={Blog} />
      </Switch>
  );
}

export default App;
