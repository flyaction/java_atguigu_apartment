package com.atguigu.lease.web.app.service.impl;

import com.atguigu.lease.model.entity.PaymentType;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.lease.model.entity.RoomPaymentType;
import com.atguigu.lease.web.app.service.RoomPaymentTypeService;
import com.atguigu.lease.web.app.mapper.RoomPaymentTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【room_payment_type(房间&支付方式关联表)】的数据库操作Service实现
* @createDate 2023-07-26 11:12:39
*/
@Service
public class RoomPaymentTypeServiceImpl extends ServiceImpl<RoomPaymentTypeMapper, RoomPaymentType>
    implements RoomPaymentTypeService {

    @Autowired
    private RoomPaymentTypeMapper roomPaymentTypeMapper;

    @Override
    public List<PaymentType> listByRoomId(Long id) {
        return roomPaymentTypeMapper.selectListByRoomId(id);
    }

}



