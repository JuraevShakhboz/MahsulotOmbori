package org.najot.dao;

import org.najot.model.Maxsulot;

import java.util.List;

public interface MaxsulotDAO {
    Maxsulot selectMaxsulotById(Integer id);
    List<Maxsulot> selectAllMaxsulot();

    boolean insertMaxsulot(Maxsulot maxsulot);
    boolean updateMaxsulot(Integer id, Maxsulot maxsulot);

    boolean deleteMaxsulot(Integer id);
}
