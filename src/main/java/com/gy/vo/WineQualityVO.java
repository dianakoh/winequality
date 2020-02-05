package com.gy.vo;

import lombok.Data;

@Data
public class WineQualityVO {
	private int product_seq;
	private float fixed_acidity;
	private float volatile_acidity;
	private float citric_acid;
	private float residual_sugar;
	private float chlorides;
	private int free_sulfur_dioxide;
	private int total_sulfur_dioxide;
	private float density;
	private float ph;
	private float sulphates;
	private float alcohol;
	private int quality;
}
