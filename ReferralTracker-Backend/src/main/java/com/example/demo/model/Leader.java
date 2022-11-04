package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leader {
	
		@Id
		public Long eid; 
		public String name; 
		public Long total;
		public Long getEid() {
			return eid;
		}
		public void setEid(Long eid) {
			this.eid = eid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getTotal() {
			return total;
		}
		public void setTotal(Long total) {
			this.total = total;
		}
		public Leader() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Leader(Long eid, String name, Long total) {
			super();
			this.eid = eid;
			this.name = name;
			this.total = total;
		} 
}
