package com.lingnan.usersys.common.dao;

import java.sql.Connection;

import javax.sql.rowset.serial.SerialException;

import com.lingnan.usersys.common.exception.ServiceException;
import com.lingnan.usersys.usermgrsys.business.dao.UserDaoImpl;
/**
 * �û�������
 * @author Administrator
 *
 */
public class DaoFactory {
	/**
	 * ����û�dao����Ĺ�������
	 * @param conn ���ݿ�����
	 * @param type dao����
	 * @return ���ع���
	 */
	public static BaseDao getBaseDao(Connection conn,String type){
		//��������dao�������û�����user����ʵ�����û�daoʵ����
		if("user".equals(type)){
			return new UserDaoImpl(conn);
			//����ʵ��������
			//throw new ServiceException("dao������������");
		}
		//���û�к�����ָ������ƥ���ֵ������ʾ������Ϣ
		else{
			throw new ServiceException("dao������������");
		}
	}

}