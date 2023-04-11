package org.example.serv;

import org.example.Hai;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class Servicing {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Hai> listAll(){
        return jdbcTemplate.query("select * from hai",new HaiMapper());
    }

    class HaiMapper implements RowMapper<Hai>{

        @Override
        public Hai mapRow(ResultSet rs, int rowNum) throws SQLException {
            Hai hai=new Hai();
            hai.setId(rs.getInt("id"));
            hai.setName(rs.getString("name"));
            hai.setPrice(rs.getInt("price"));
            return hai;
        }
    }
}
