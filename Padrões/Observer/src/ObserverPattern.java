import java.util.ArrayList;
import java.util.List;

// Interface Observer que será implementada por todos os observadores
interface Observer {
    void update(String message);
}

// Classe Subject que mantém a lista de observadores e os notifica
class Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    // Método para adicionar um observador
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Método para remover um observador
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Método para notificar todos os observadores sobre a mudança de estado
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    // Método para mudar o estado do Subject e notificar os observadores
    public void setState(String newState) {
        this.state = newState;
        notifyObservers();
    }
}

// Classe concreta Observer que reage às mudanças no Subject
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " recebeu atualização: " + message);
    }
}

// Exemplo de uso
public class ObserverPattern {
    public static void main(String[] args) {
        // Criação do Subject
        Subject subject = new Subject();

        // Criação de Observers
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        // Adiciona os observadores ao Subject
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Altera o estado do Subject e notifica os observadores
        subject.setState("Novo estado 1");

        // Remove um observador e altera o estado novamente
        subject.removeObserver(observer1);
        subject.setState("Novo estado 2");
    }
}
