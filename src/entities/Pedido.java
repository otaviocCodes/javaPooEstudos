package entities;

import java.util.Date;

import entities_enum.OrderStatus;

public class Pedido {

		private Integer id;
		private Date momento;
		private OrderStatus status;
		
		
		public Pedido() {
		}


		public Pedido(Integer id, Date momento, OrderStatus status) {

			this.id = id;
			this.momento = momento;
			this.status = status;
		}


		public Integer getId() {
			return id;
		}


		public Date getMomento() {
			return momento;
		}


		public OrderStatus getStatus() {
			return status;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public void setMomento(Date momento) {
			this.momento = momento;
		}


		public void setStatus(OrderStatus status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "Pedido [id=" + id + ", momento=" + momento + ", status=" + status + "]";
		}
		
}
