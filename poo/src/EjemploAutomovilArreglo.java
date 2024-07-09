import java.util.Arrays;

public class EjemploAutomovilArreglo {
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


        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
        new Motor (16, TipoMotor.BENCINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);


        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Pérez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for(int i = 0; i< autos.length; i++){
            System.out.println(autos[i]);
        }



    }
}
