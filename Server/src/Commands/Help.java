package Commands;


/***
 * Класс, реализующий команду help
 */

public class Help extends Comands {
    public byte[] bb;
    public Help() {
        name = "help";
        commandsNames.add(name);
    }

    public void help() {
        String answer;
        System.out.println("Справка:");
        System.out.println(
                        "help : вывести справку по доступным командам\n" +
                        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                        "add {element} : добавить новый элемент в коллекцию\n" +
                        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                        "remove_by_id id : удалить элемент из коллекции по его id\n" +
                        "clear : очистить коллекцию\n" +
                        "save : сохранить коллекцию в файл\n" +
                        "execute_script file_name : считать и исполнить скрипт из указанного файла. \nВ скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                        "exit : завершить программу (без сохранения в файл)\n" +
                        "add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента коллекции\n" +
                        "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
                        "remove_lower {element} : удалить из коллекции все элементы, меньше, чем заданный\n" +
                        "sum_of_salary : вывести сумму значений поля salary для всех элементов коллекции\n" +
                        "max_by_status : вывести вывести любой объект из коллекции, значение поля status которого является максимальным\n" +
                        "count_less_than_start_date {startDate} : вывести количество элементов, значение поля startDate которых, меньше заданного");
                        answer = ("Справка:\n"+
                        "help : вывести справку по доступным командам\n" +
                        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                        "add {element} : добавить новый элемент в коллекцию\n" +
                        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                        "remove_by_id id : удалить элемент из коллекции по его id\n" +
                        "clear : очистить коллекцию\n" +
                        "execute_script file_name : считать и исполнить скрипт из указанного файла.\n" +
                        "В скрипте содержатся команды в таком же виде,\n"+
                        "в котором их вводит пользователь в интерактивном режиме.\n" +
                        "exit : завершить программу (без сохранения в файл)\n" +
                        "add_if_min {element} : добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента коллекции\n" +
                        "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
                        "remove_lower {element} : удалить из коллекции все элементы, меньше, чем заданный\n" +
                        "sum_of_salary : вывести сумму значений поля salary для всех элементов коллекции\n" +
                        "max_by_status : вывести вывести любой объект из коллекции, значение поля status которого является максимальным\n" +
                        "count_less_than_start_date {startDate} : вывести количество элементов, значение поля startDate которых, меньше заданного");
        bb = (answer).getBytes();
    }

}

