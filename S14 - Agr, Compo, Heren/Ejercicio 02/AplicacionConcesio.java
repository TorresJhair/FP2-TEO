public class AplicacionConcesio {
    public static void main(String [] args){
        Gerente seniorGeren = new Gerente("Sophy");

        Concesionario miEmpresa = new Concesionario("Epis", seniorGeren);
        Vendedor vendedor1 = new Vendedor("Oscar");
        Vendedor vendedor2 = new Vendedor("Mary");
        Vendedor vendedor3 = new Vendedor("Lua");

        miEmpresa.addVendedor(vendedor1);
        miEmpresa.addVendedor(vendedor2);
        miEmpresa.addVendedor(vendedor3);

        miEmpresa.addAuto(new Auto("hYUNDAY M123"));
        miEmpresa.addAuto(new Auto("SAMSUMNG S23"));
        miEmpresa.addAuto(new Auto("FIAT 8M - 2018"));

        miEmpresa.prntStatus();
    }
}
