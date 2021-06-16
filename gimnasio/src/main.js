import Vue from "vue";
import Router from "vue-router";

import App from "./App";
import Inicio from "./views/Inicio";
import Login from "./views/Login";
import Registro from "./views/Registro";

Vue.use(Router);

const routes = [
  { path: "/", component: Inicio },
  { path: "/login", component: Login },
  { path: "/registro", component: Registro }
];

const router = new Router({
  routes
});
