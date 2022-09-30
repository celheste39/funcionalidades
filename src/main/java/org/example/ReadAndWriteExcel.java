package org.example;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class ReadAndWriteExcel implements Task {
    Target element;
    private int  Columna, Celda;
    public ReadAndWriteExcel(int Columna, int Celda, Target element) {
        this.Columna = Columna;
        this.Celda = Celda;
        this.element = element;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        GuardarExcel guardar = new GuardarExcel();
        String filePath = "C:/Users/SQA/OneDrive - SQA/Documentos/Sequoia/FullStack/AveriaPqrEdge/Data.xlsx";
    }
}