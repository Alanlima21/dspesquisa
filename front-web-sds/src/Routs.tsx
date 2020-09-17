import React from 'react';
import { BrowserRouter, Switch,Route } from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header';
import Records from './pages/Records';

const Routs = () =>(
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/" exact>
                <Home/>
            </Route>
            <Route path="/records">
                <Records/>
            </Route>
        </Switch>
    </BrowserRouter>
);

export default Routs;