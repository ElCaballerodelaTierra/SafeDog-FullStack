package com.safedog.safedog.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.safedog.safedog.model.Servicios;
import com.safedog.safedog.repository.ServiciosRepository;


@Service
public class ServiciosService {

			private ServiciosRepository ServiciosRepository;
			
			@Autowired
			public ServiciosService (ServiciosRepository ServiciosRepository) {
				this.ServiciosRepository  = ServiciosRepository;
			}
			
			
		
			public List <Servicios> getAll(){
				return ServiciosRepository.findAll();
			}



			public Servicios createServicio(Servicios servicio) {
				// TODO Auto-generated method stub estaba como return null
				return ServiciosRepository.save (servicio);
			
			}
	


}
