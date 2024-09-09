public class MarioPequeno implements MarioState {

    public MarioState pegarCogumelo() {
        System.out.println("Mario cresceu");
        return new MarioGrande();
    }

    public MarioState pegarFlor() {
        System.out.println("Mario grande e com fogo");
        return new MarioFogo();
    }

    public MarioState pegarPena(){
        System.out.println("Mario grande e com capa");
        return new MarioCapa();
    }

    public MarioState levarDano() {
        System.out.println("Mario morre");
        return this;
    }
}