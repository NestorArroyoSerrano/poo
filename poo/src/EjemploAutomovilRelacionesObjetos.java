public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        /*
        ruedasSub[0] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[1] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[2] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[3] = new Rueda("Yokohama", 16, 7.5);
        ruedasSub[4] = new Rueda("Yokohama", 16, 7.5);
        */

        Persona conductorSubaru = new Persona("Luci", "Martínez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
    //    subaru.setRuedas(ruedasSub);


        Rueda[] ruedasSub = new Rueda[5];
        for(int i = 0; i < ruedasSub.length; i++){
           subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }


     //   System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
      //  System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

/*
        Rueda[] ruedasMaz = new Rueda[5];
                {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)};
                */

        Persona pato = new Persona("Pato", "Rodríguez");
        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
     //   mazda.setColor("Rojo");
      //  mazda.setCilindrada(3.0);
       mazda.setEstanque(new Estanque());
       mazda.setConductor(pato);
    //   mazda.setRuedas(ruedasMaz);
      // System.out.println("mazda.fabricante = " + mazda.getFabricante());


        Rueda[] ruedasMaz = new Rueda[5];
        for(int i = 0; i< ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

/*
        Rueda[] ruedasNissan = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};
*/

        Persona bea = new Persona("Bea", "González");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5))
                .addRueda(new Rueda("Pirelli", 20, 11.5));

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5),
                new Rueda("Pirelli", 20, 11.5)};


        Persona lalo = new Persona("Lalo", "Mena");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
        new Motor (3.5, TipoMotor.BENCINA), new Estanque(50), ruedasNissan2, lalo);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil.setColorPatente(Color.BLANCO);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        /*

        System.out.println("Conductor subaru:" + subaru.getConductor());
        System.out.println("Ruedas subaru: ");
        for(Rueda r: subaru.getRuedas()){
            System.out.println(r.getFabricante() + ", aro: " + r.getAro() + ", ancho:" + r.getAncho());
        }
*/
    }
}
