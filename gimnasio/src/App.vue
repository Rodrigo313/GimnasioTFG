<template>
  <div id="nav">
    <router-link to="/">Inicio</router-link> 
    <router-link to="/registro">Registro</router-link> 
    <router-link to="/beneficios">Beneficios</router-link> 
    <router-link to="/actividadesSemanales">Actividades semanales</router-link> 
    <router-link to="/perfil">Perfil</router-link>
  </div>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
  
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
  padding: 30px;
  margin: 30px;
  background-color: black;
  color: white;
}

#nav a:hover{
  background-color: green;
}


#nav a.router-link-exact-active {
  background-color: green;
}
</style>
