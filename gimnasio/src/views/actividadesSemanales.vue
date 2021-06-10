<template>
   <body>
    <table class="tabla">
        <tr class="dias">
            <th class="dias">LUNES</th>
            <th class="dias">MARTES</th>
            <th class="dias">MIERCOLES</th>
            <th class="dias">JUEVES</th>
            <th class="dias">VIERNES</th>
            <th class="dias">SABADO</th>
            <th class="dias">DOMINGO</th>
        </tr>
        <tr>
            <td class="actividad" colspan="2">NATACIÓN</td>
            <td class="actividad">YOGA</td>
            <td class="actividad">AEROBIC</td>
            <td class="actividad" colspan="2">AL AIRE LIBRE</td>
            <td class="actividad" rowspan="2">BODY COMBAT</td>
        </tr>
        <tr>
            <td class="actividad">YOGA</td>
            <td class="actividad" colspan="3"></td>
            <td class="actividad" rowspan="2">ZUMBA</td>
            <td class="actividad">BODY BALANCE</td>
        </tr>
        <tr>
            <td class="actividad" colspan="2"></td>
            <td class="actividad">NATACIÓN</td>
            <td class="actividad">AL AIRE LIBRE</td>
            <td class="actividad" colspan="2">BODY PUMP</td>
        </tr>
    </table>
   </body>
</template>

<script>
export default {
    
}
</script>

<style scoped>
    body{
        background-color: black;
    }
    .tabla{
        margin-top: 50px;
        padding: 50px;
        margin-left: 230px;
        border-collapse: separate;
        border-spacing: 10px 5px;
       
    }
    .dias{
        border: green solid 2px;
        color: green;
        padding: 50px;
    }
    .actividad{
        border: green solid 2px;
        background-color: green;
        color: white; 
        padding: 50px;
    }
</style>