package org.najot.dao;

import org.najot.mapper.MaxsulotMapper;
import org.najot.model.Maxsulot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaxsulotDAOImpl implements MaxsulotDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Maxsulot selectMaxsulotById(Integer id) {

        return (Maxsulot) jdbcTemplate
                .query("select * from maxsulot where id=?",
                        new Object[]{id}, new MaxsulotMapper());
    }

    @Override
    public List<Maxsulot> selectAllMaxsulot() {
        return jdbcTemplate.query("select * from maxsulot order by id",new MaxsulotMapper());
    }

    @Override
    public boolean insertMaxsulot(Maxsulot maxsulot) {
        jdbcTemplate.update(
                "insert into maxsulot(nomi, narxi) values (?,?)",
                maxsulot.getNomi(),maxsulot.getNarxi());
        return true;
    }

    @Override
    public boolean updateMaxsulot(Integer id, Maxsulot maxsulot) {
        jdbcTemplate.update(
                "update maxsulot set nomi=?,narxi=? where id=?",
        maxsulot.getNomi(), maxsulot.getNarxi(), id);
        return true;
    }

    @Override
    public boolean deleteMaxsulot(Integer id) {
        jdbcTemplate.update(
                "delete from maxsulot where id=?", id);
        return true;
    }
}
