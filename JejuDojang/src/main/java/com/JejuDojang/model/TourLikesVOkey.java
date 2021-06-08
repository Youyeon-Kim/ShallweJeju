package com.JejuDojang.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TourLikesVOkey implements Serializable {

	
	GroupsVO group;
	
	
	MembersVO member;
	
	
	JejuTourListVO tourlist;


	
	
}
