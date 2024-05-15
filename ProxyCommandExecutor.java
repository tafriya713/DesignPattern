package ProxyDP;

public class ProxyCommandExecutor implements CommandExecutor{
    private CommandExecutor realExecutor;
    private String userRole;

    public ProxyCommandExecutor(String userRole) {
        this.userRole = userRole;
        this.realExecutor = new RealCommandExecutor();
    }
    @Override
    public void executeCommand(String command) throws Exception {
        if (userRole.equals("admin")) {
            realExecutor.executeCommand(command);
        } else if (userRole.equals("normal")) {
            if (!command.equals("rm_rf")) {
                realExecutor.executeCommand(command);
            } else {
                throw new SecurityException("rm_rf command is not allowed for normal users.");
            }
        } else {
            throw new IllegalArgumentException("Invalid user role.");
        }
    }

}
