package br.cesul.biblioteca.ui;

import br.cesul.biblioteca.dao.BookDao;

import javafx.collections.FXCollections;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class StatsPane extends BorderPane implements Refreshable {

    private final BookDao dao = new BookDao();
    private final PieChart chart = new PieChart();

    public StatsPane() {

    }

    @Override public void refresh() {

    }
}
