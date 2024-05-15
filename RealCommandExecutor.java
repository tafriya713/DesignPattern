package ProxyDP;

public class RealCommandExecutor implements CommandExecutor{
    @Override
    public void executeCommand(String command) throws Exception {
        System.out.println("Executing command: " + command);
    }
}

