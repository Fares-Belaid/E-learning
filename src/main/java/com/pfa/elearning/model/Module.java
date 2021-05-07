package com.pfa.elearning.model;



import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Module {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description")
	private String description;

	@Lob
	@Column(name = "image")
	private byte[] image;

	@Column(name = "image_content_type")
	private String imageContentType;

	@Lob
	@Column(name = "pdf")
	private byte[] pdf;

	@Column(name = "pdf_content_type")
	private String pdfContentType;
	
	@ManyToOne
	private Cours cours;
	
}
