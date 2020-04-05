package com.liferay.docs.transfer.model.copy;

public class Entry {

		private String name;
		private String message;
		private String type;
		private String category;
		private String contract;
		private String unit;
		private String branch;
		private String unit2;
		private String branch2;
		private String comments;

		public Entry() {
			this.name = null;
			this.message = null;
			this.type = null;
			this.category = null;
			this.contract = null;
			this.unit = null;
			this.branch = null;
			this.unit2 = null;
			this.branch2 = null;
			this.comments = null;
		}

		public Entry(String name, String message, String type, String category, String contract, String unit,
				String branch, String unit2, String branch2, String comments) {
			setName(name);
			setMessage(message);
			setType(type);
			setCategory(category);
			setContract(contract);
			setUnit(unit);
			setBranch(branch);
			setUnit2(unit2);
			setBranch2(branch2);
			setComments(comments);
		}

		public String getName() {
			return name;
		}

		public String getMessage() {
			return message;
		}

		public String getType() {
			return type;
		}

		public String getCategory() {
			return category;
		}

		public String getContract() {
			return contract;
		}

		public String getUnit() {
			return unit;
		}

		public String getBranch() {
			return branch;
		}

		public String getUnit2() {
			return unit2;
		}

		public String getBranch2() {
			return branch2;
		}

		public String getComments() {
			return comments;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public void setType(String type) {
			this.type = type;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public void setContract(String contract) {
			this.contract = contract;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public void setUnit2(String unit2) {
			this.unit2 = unit2;
		}

		public void setBranch2(String branch2) {
			this.branch2 = branch2;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

	}

