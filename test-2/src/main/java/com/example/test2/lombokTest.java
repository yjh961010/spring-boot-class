package com.example.test2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor //lombokTest()
@AllArgsConstructor // lombokTest(String,String,String)
public class lombokTest {
	private String id;
	private String name;
	private String cname;
}
