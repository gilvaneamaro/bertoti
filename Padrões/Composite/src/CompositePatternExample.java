import java.util.ArrayList;
import java.util.List;

// Interface Component que define as operações que serão implementadas por folhas e composições
interface Component {
    void showDetails();
}

// Classe Leaf (Folha) que representa objetos individuais
class Leaf implements Component {
    private String name;
    private String position;

    public Leaf(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " trabalha como " + position);
    }
}

// Classe Composite que pode conter folhas ou outros composites
class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    // Método para adicionar um componente à composição
    public void addComponent(Component component) {
        components.add(component);
    }

    // Método para remover um componente da composição
    public void removeComponent(Component component) {
        components.remove(component);
    }

    // Método para exibir os detalhes de todos os componentes da composição
    @Override
    public void showDetails() {
        for (Component component : components) {
            component.showDetails();
        }
    }
}

// Exemplo de uso do padrão Composite
public class CompositePatternExample {
    public static void main(String[] args) {
        // Criação de folhas (objetos individuais)
        Component dev1 = new Leaf("João", "Desenvolvedor");
        Component dev2 = new Leaf("Maria", "Desenvolvedora");
        Component tester = new Leaf("Ana", "Testadora");

        // Criação de uma composição (Equipe de Desenvolvimento)
        Composite developmentTeam = new Composite();
        developmentTeam.addComponent(dev1);
        developmentTeam.addComponent(dev2);

        // Criação de outra composição (Departamento de TI) que contém outra composição
        Composite itDepartment = new Composite();
        itDepartment.addComponent(developmentTeam); // Adiciona a equipe de desenvolvimento
        itDepartment.addComponent(tester); // Adiciona um testador

        // Exibe os detalhes do departamento de TI
        System.out.println("Detalhes do Departamento de TI:");
        itDepartment.showDetails();
    }
}
