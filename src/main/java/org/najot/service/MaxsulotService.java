package org.najot.service;

import org.najot.model.Maxsulot;

import java.util.List;

public interface MaxsulotService {

    Maxsulot getMaxsulotById(Integer id);
    List<Maxsulot> getMaxsulotList();

    boolean addMaxsulot(String nomi, float narxi);
    boolean updateMaxsulot(Integer id, String nomi, float narxi);
    boolean deleteMaxsulot(Integer id);

}
