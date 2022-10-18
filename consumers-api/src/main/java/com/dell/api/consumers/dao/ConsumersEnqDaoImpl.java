package com.dell.api.consumers.dao;

import com.dell.api.consumers.entity.Consumers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsumersEnqDaoImpl implements ConsumersEnqDao {

    @Override
    public List<Consumers> selectAllConsumers() {
        String selectQuery = "select * from consumers";

        PreparedStatement pstmt = null;
        Connection conn = null;

        List<Consumers> list = new ArrayList<>();

        try {
            pstmt = conn.prepareStatement(selectQuery);

            ResultSet rs = pstmt.executeQuery();



            while (rs.next()) {
                Consumers consumers = new Consumers();
                consumers.setUserid(rs.getInt("userid"));
                consumers.setUsername(rs.getString("username"));
                consumers.setMobilenumber(rs.getDouble("mobilenumber"));
                consumers.setRewardpoints(rs.getDouble("rewardpoints"));
                list.add(consumers);

            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return list;
    }
}
