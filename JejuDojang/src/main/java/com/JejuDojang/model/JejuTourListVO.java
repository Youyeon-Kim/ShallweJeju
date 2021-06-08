package com.JejuDojang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@Entity
@Table(name = "jeju_tourlists", uniqueConstraints = {
		@UniqueConstraint(name = "TOUR_LIST_UNIQUE", columnNames = { "TOURLIST_ID", "DESCSEO", "IMAGPATH",
				"INTODUCTION", "LATITUDE", "LONGITUDE", "PHONENO", "ROADADDRESS", "TAG", "THUMBNAILPATH", "TITLE" }) })
@NoArgsConstructor
@AllArgsConstructor
public class JejuTourListVO {

	@Id
	// contentsid
	private String tourlist_id;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String roadaddress;
	
	@Column(nullable = false)
	private String tag;
	
	@Column(nullable = false)
	private String intoduction;
	
	@Column(nullable = false)
	private Long latitude;
	
	@Column(nullable = false)
	private Long longitude;
	
	@Column(nullable = false)
	private String phoneno;
	
	@Column(nullable = false)
	private String descseo;
	
	@Column(nullable = false)
	private String imagpath;
	
	@Column(nullable = false)
	private String thumbnailpath;
}
