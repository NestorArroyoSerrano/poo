import java.util.Date;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setColor(Color.BLANCO);
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setTipo(TipoAutomovil.HATCHBACK);


        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);


        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,  new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
     //   mazda.setColor("Rojo");
      //  mazda.setCilindrada(3.0);
    //    mazda.setEstanque(new Estanque());
        System.out.println("mazda.fabricante = " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
        new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);


        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
        new Motor (3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil.setColorPatente(Color.BLANCO);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = "  + Automovil.getColorPatente().getColor());
        System.out.println("kilómetros por litros = " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad máxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("Tipo subaru: " + tipoSubaru.getNombre());
        System.out.println("Tipo desc. subaru: " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300, 70));

    }
}
