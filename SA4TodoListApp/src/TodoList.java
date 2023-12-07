import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TodoList extends JFrame {

    
    // atributos
    private JPanel mainPanel;// painel principal
    private JTextField inputP;// no painel a entrada de dados q será o texto
    private JButton addButton;// botao de adicionar
    private JList<String> taskList;// listar as tarefas
    private DefaultListModel<String> listModel;
    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton limparConcluidas;
    private List<Task> tasks;

    // construtor
    public TodoList() {


        
        // Configuração da janela principal
        super("To-Do List App");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(450, 350);
        // Inicializa o painel principal
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(255, 204, 0)); // Amarelo Lakers (#FFCC00)
        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        // Inicializa campos de entrada, botões e JComboBox
        inputP = new JTextField();
        addButton = new JButton("Adicionar");
        deleteButton = new JButton("Excluir");
        markDoneButton = new JButton("Concluir");
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas", "Concluídas" });
        limparConcluidas = new JButton("Limpar Concluídas");

        // Defina as cores dos botões
        addButton.setBackground(new Color(125, 48, 168)); // Roxo Lakers (#7D30A8)
        addButton.setForeground(new Color(255, 204, 0)); // Amarelo Lakers (#FFCC00)
        
        deleteButton.setBackground(new Color(125, 48, 168)); // Roxo Lakers (#7D30A8)
        deleteButton.setForeground(new Color(255, 204, 0)); // Amarelo Lakers (#FFCC00)
        
        markDoneButton.setBackground(new Color(125, 48, 168)); // Roxo Lakers (#7D30A8)
        markDoneButton.setForeground(new Color(255, 204, 0)); // Amarelo Lakers (#FFCC00)

        limparConcluidas.setBackground(new Color(125, 48, 168)); // Roxo Lakers (#7D30A8)
        limparConcluidas.setForeground(new Color(255, 204, 0)); // Amarelo Lakers (#FFCC00)

        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputP, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(deleteButton);
        buttonPanel.add(markDoneButton);
        buttonPanel.add(filterComboBox);
        buttonPanel.add(limparConcluidas);

        // Adiciona os componentes ao painel principal
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        //alterar cor do text field para dourado
        inputP.setBackground(new Color(255, 204, 0)); 

        // Adiciona o painel principal à janela
        this.add(mainPanel);
        this.setVisible(true);

        //configuração do listener
        
        //ação dos botões
        //botao de ação para adicionar tarefas
    addButton.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            addTask();
        }
    }); 
    //botão de ação para deletar tarefas
    deleteButton.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            deleteTask();
        }
    });
    // limpar tarefas concluidas pelo botão
    limparConcluidas.addActionListener((ActionListener) new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            clearCompletedTasks();
        }
    });
    //concluir tarefas
    markDoneButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            markTaskDone();
        }
    });
    //filtrar o tipo de tarefa
    filterComboBox.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            filterTasks();
        }
    });




    // Inserir dados com a tecla ENTER
    inputP.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent arg0) {
            if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
                addTask();
            }
        }
    });

    // Remover dados da lista com a tecla DELETE
    taskList.addKeyListener(new KeyAdapter() {
        @Override
        public void keyPressed(KeyEvent arg0) {
            if (arg0.getKeyCode() == KeyEvent.VK_DELETE) {
                deleteTask();
            }
        }
    });
    // double click para escolher qual ação deseja executar da tarefa
    taskList.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent arg0) {
            if(arg0.getClickCount() == 2){
                int avisoAcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja fazer com está tarefa:"+ "\n 1 - Concluir tarefa"+"\n 2 - Excluir tarefa"));
            if(avisoAcao == 1){
                
                markTaskDone();
            }else if(avisoAcao == 2){


                

                deleteTask();
            }
            }
        }
    });
    //fecha a aplicação quando apertar no "X"
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent event) {
            int choice = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar a aplicação?", "Fechar Aplicação", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            }
        
    });
    


    }
    


    // Criar os métodos (CRUD)
    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        String taskDescription = inputP.getText().trim();// remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            inputP.setText("");
        }
    }

    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            //joptionpane de confirmação de exclusão de task
            int choice = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta tarefa?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if(choice ==JOptionPane.YES_NO_OPTION){
                JOptionPane.showMessageDialog(null, "A tarefa foi excluida com sucesso");
                tasks.remove(selectedIndex);
            updateTaskList();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão foi cancelada");
            }
            
        }
    }

    private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(true);
            updateTaskList();
        }
    }

    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription()+ (task.isDone() ?

                    " (Concluída)" : ""));
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>();



        
        for (Task task : tasks) {
            if (task.isDone()) {
                completedTasks.add(task);
            }
        }
        tasks.removeAll(completedTasks);
        updateTaskList();
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isDone() ?

                    " (Concluída)" : ""));

        }
    }

    public void run() {
        // Exibe a janela
        this.setVisible(true);
    }
}
