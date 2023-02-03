package com.example.ycheb;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button enter;

    @FXML
    private ListView<String> firstList;

    @FXML
    private ListView<String> secondList;

    @FXML
    void enter_click(ActionEvent event) {

        String choice = ""; //обьект, в который записывается значение при выборе
        ObservableList<String> object; //обьект листа, который мы выбрали и записывает в мессэдж
        object = firstList.getSelectionModel().getSelectedItems();

        for (String o: object){
            choice += o;
        }
        String choice1 = "";

        ObservableList<String> object2;
        object2 = secondList.getSelectionModel().getSelectedItems();

        for (String o2: object2){
            choice1 += o2;
        }

        if(choice1.equals("") || choice.equals("")){
            JOptionPane.showMessageDialog(null, "Ошибка!");
        }
        else {
            enter.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("cur2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Scene scene = new Scene(root, 500, 300);

            ListView list1 = (ListView) scene.lookup("#listOfFirst");
            ListView list2 = (ListView) scene.lookup("#listOfSecond");
            Label l1 = (Label) scene.lookup("#l1");
            Label l2 = (Label) scene.lookup("#l2");
            Label l3 = (Label) scene.lookup("#l3");
            Label l4 = (Label) scene.lookup("#l4");
            Label l5 = (Label) scene.lookup("#l5");
            Label l6 = (Label) scene.lookup("#l6");
            Label l7 = (Label) scene.lookup("#l7");
            Label l8 = (Label) scene.lookup("#l8");

            Label d = (Label) scene.lookup("#firstPrice");
            Label v = (Label) scene.lookup("#secondPrice");

            if (choice.equals("ООО КУЗМЗ")) {
                list1.getItems().addAll("сталь", "д16-дюраль", "медь", "текстолит");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("1259");
                l2.setText("1349");
                l3.setText("1590");
                l4.setText("1230");

                d.setText("г. Казань ул. Пугова 191 (т. 45-45-45)");
            }
            if (choice.equals("МетПромИнтек")) {
                list1.getItems().addAll("ДСВ2Л пресс-материал", "смесь резиновая", "пенополистерол", "стеклотекстолит");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("1355");
                l2.setText("1179");
                l3.setText("1280");
                l4.setText("1080");

                d.setText("г. Москва ул. Котова 83в (т. 206-206)");
            }
            if (choice.equals("МК Уралсталь")) {
                list1.getItems().addAll("латунь", "гетинакс", "12КН 18Т", "АМГ 2М");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("1470");
                l2.setText("1330");
                l3.setText("1510");
                l4.setText("1490");

                d.setText("г. Тамбов ул. Пухова 14 (т. 530-530)");
            }
            if (choice.equals("Металл-Союз")) {
                list1.getItems().addAll("второпласт", "силфор", "медь", "д16-дюраль");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("1360");
                l2.setText("1270");
                l3.setText("1410");
                l4.setText("1390");

                d.setText("г. Архангельск ул. Кутузова 67с (т.23-67-45)");
            }
            if (choice.equals("Мегамет")) {
                list1.getItems().addAll("сталь", "пинтосил", "пинтосил", "капралон");
                list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l1.setText("990");
                l2.setText("1310");
                l3.setText("1280");
                l4.setText("1150");

                d.setText("г. Пенза ул. Попова 85а (т.43-78-43)");
            }

            if (choice1.equals("Авиапромсталь")) {
                list2.getItems().addAll("пропласт", "пенопласт", "латунь Л63", "оркстекло");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("1000");
                l6.setText("800");
                l7.setText("1200");
                l8.setText("850");

                v.setText("г. Москва ул. Толстого 84а (т. 56-00-56)");
            }
            if (choice1.equals("Стальметурал")) {
                list2.getItems().addAll("текстолит", "гетинакс", "капралон", "пинтосил");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("940");
                l6.setText("1300");
                l7.setText("1250");
                l8.setText("1400");

                v.setText("г. Екатиренбург ул. Окружная 156б (т. 67-89-54)");
            }
            if (choice1.equals("СпецМеталлГрупп")) {
                list2.getItems().addAll("АМГ2М", "БРБ", "капралон", "второпласт");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("1050");
                l6.setText("1300");
                l7.setText("1250");
                l8.setText("960");

                v.setText("г. Пенза ул. Генерала Глазунова 97 (т. 230-230)");
            }
            if (choice1.equals("МетПромКо")) {
                list2.getItems().addAll("д16-дюраль", "АМГ6", "сплав АК12", "АБС");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("1100");
                l6.setText("980");
                l7.setText("890");
                l8.setText("1090");

                v.setText("г. Воронеж ул. Строилелей 58в (т. 450-450)");
            }
            if (choice1.equals("ЗАО Металлторг")) {
                list2.getItems().addAll("силфор", "медь", "латунь", "пропласт");
                list2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                l5.setText("1000");
                l6.setText("1500");
                l7.setText("900");
                l8.setText("950");

                v.setText("г. Саратов ул. Кирова 140д (т. 99-00-99)");
            }
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstList.getItems().addAll("ООО КУЗМЗ", "МетПромИнтек", "МК Уралсталь", "Металл-Союз", "Мегамет");
        firstList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        secondList.getItems().addAll("Авиапромсталь", "Стальметурал", "СпецМеталлГрупп", "МетПромКо", "ЗАО Металлторг");
        secondList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    }

