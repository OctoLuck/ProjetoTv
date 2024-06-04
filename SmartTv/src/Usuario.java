public class Usuario {
    public static void main(String[] args) throws Exception {
      
      SmartTv smartTv = new SmartTv();
      System.out.println("Canal Atual: "+smartTv.canal);

     smartTv.mudarCanal(13);
     System.out.println("Canal Atual: "+smartTv.canal);
      
        smartTv.DimimuirVolume();
        smartTv.DimimuirVolume();
        smartTv.DimimuirVolume();
        smartTv.AumentarVolume();
      System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Tv esta Ligada? "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

      smartTv.ligar();
      System.out.println("Atv esta ligada? " +smartTv.ligada);

      smartTv.desligar();

      System.out.println( "a Tv desligada? " +smartTv.ligada);

  }
      
      

}
