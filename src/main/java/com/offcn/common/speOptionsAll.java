package com.offcn.common;

import java.io.Serializable;
import java.util.List;

import com.offcn.pojo.TbSpecification;
import com.offcn.pojo.TbSpecificationOption;

public class speOptionsAll  implements Serializable{
	private TbSpecification specificationone;
	private List<TbSpecificationOption> options;
	public TbSpecification getSpecificationone() {
		return specificationone;
	}
	public void setSpecificationone(TbSpecification specificationone) {
		this.specificationone = specificationone;
	}
	public List<TbSpecificationOption> getOptions() {
		return options;
	}
	public void setOptions(List<TbSpecificationOption> options) {
		this.options = options;
	}
	public speOptionsAll() {
		super();
		// TODO Auto-generated constructor stub
	}
	public speOptionsAll(TbSpecification specificationone, List<TbSpecificationOption> options) {
		super();
		this.specificationone = specificationone;
		this.options = options;
	}
	@Override
	public String toString() {
		return "speOptionsAll [specificationone=" + specificationone + ", options=" + options + "]";
	}
	
	

}
