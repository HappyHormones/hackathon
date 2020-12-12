package pl.pja.edu.hackathon.model.memocard;

import lombok.*;
import pl.pja.edu.hackathon.model.BaseEntity;


import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemoCard extends BaseEntity {

	private String name;
	private String definition;
	private CategoryEnum categoryEnum;
	@ManyToOne
	private Statistics statistics;
	private Boolean ignored;
	private Boolean starred;

}