package com.jsf;

import java.util.Arrays;
import java.util.Comparator;

import javax.faces.model.DataModel;

public final class SortFilterModel<E> extends DataModel<E> {

     private DataModel<E> model;
     private Integer[] rows;

//     public SortFilterModel() { // mandated by JSF spec
//          setWrappedData(null);
//     }
//
//     public SortFilterModel(E[] names) { // recommended by JSF spec
//          setWrappedData(names);
//     }
     public SortFilterModel(DataModel<E> model) {
          this.model = model;
          initializeRows();
     }

     private void initializeRows() {
          int rowCnt = model.getRowCount();
          if (rowCnt != -1) {
               rows = new Integer[rowCnt];
               for (int i = 0; i < rowCnt; ++i) {
                    rows[i] = i;
               }
          }
     }

     private E getData(int row) {
          //       int originalIndex = model.getRowIndex();
          model.setRowIndex(row);
          E thisRowData = model.getRowData();
//          model.setRowIndex(originalIndex);
          return thisRowData;
     }

     public void sortBy(final Comparator<E> dataComp) {
          Comparator<Integer> rowComp = new Comparator<Integer>() {
               @Override
               public int compare(Integer r1, Integer r2) {
                    E e1 = getData(r1);
                    E e2 = getData(r2);
                    return dataComp.compare(e1, e2);
               }
          };
          Arrays.sort(rows, rowComp);
     }

     @Override
     public void setRowIndex(int rowIndex) {
          if (0 <= rowIndex && rowIndex < rows.length) {
               model.setRowIndex(rows[rowIndex]);
          } else {
               model.setRowIndex(rowIndex);
          }
     }

     @Override
     public E getRowData() {
          return model.getRowData();
     }

     // The following methods delegate to the decorated model
     @Override
     public boolean isRowAvailable() {
          return model.isRowAvailable();
     }

     public int getRowCount() {
          return model.getRowCount();
     }

     public int getRowIndex() {
          return model.getRowIndex();
     }

     public Object getWrappedData() {
          return model.getWrappedData();
     }

     public void setWrappedData(Object data) {
          model.setWrappedData(data);
          initializeRows();
     }

}
