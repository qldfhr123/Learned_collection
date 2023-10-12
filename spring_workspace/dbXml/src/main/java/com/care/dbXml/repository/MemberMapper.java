package com.care.dbXml.repository;


import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.care.dbXml.dto.MemberDTO;

@Repository
public interface MemberMapper {
	MemberDTO login (String id);
	MemberDTO selectId(String id);
	void register(MemberDTO member);
	void update(MemberDTO member) ;
	void delete(String id);
	int count(@Param("select")String select, @Param("search")String search); 
	ArrayList<MemberDTO> list(@Param("begin")int begin,@Param("end") int end, @Param("select")String select, @Param("search")String search);
}

