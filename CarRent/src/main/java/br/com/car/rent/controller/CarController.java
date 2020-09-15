package br.com.car.rent.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.car.rent.exception.CarException;
import br.com.car.rent.model.Car;
import br.com.car.rent.model.ExceptionModel;
import br.com.car.rent.model.ResponseModel;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping(value = "/car-rent/cars")

public class CarController {

	private static final Logger logger = LoggerFactory.getLogger(CarController.class);
	
	@PostMapping
	public ResponseEntity<ResponseModel> insert(@RequestBody @Valid Car car) throws CarException, SQLException {

		return null;
	}
	
	@PostMapping
	public ResponseEntity<ResponseModel> update(@RequestBody @Valid Car car) throws CarException, SQLException {

		return null;
	}

	@DeleteMapping(path="/{id}")
	public ResponseEntity<ResponseModel> delete(@PathVariable("id") @NotBlank(message="id is required") Long id) throws CarException, SQLException {

		return null;
	}
	
	@GetMapping
	public ResponseEntity<ResponseModel> getById(int id) throws CarException, SQLException {

		return null;
	}
	
	@GetMapping
	public ResponseEntity<ResponseModel> getByPlaca(String placa) throws CarException, SQLException {

		return null;
	}	
	
	@GetMapping(value = "/ping")
	public ResponseEntity<String> pingApplication() {
		return new ResponseEntity<>("Hello World !", HttpStatus.OK);
	}

	@ExceptionHandler(SQLException.class)
	public ResponseEntity<ExceptionModel> handleSQLException(SQLException e) {
		ExceptionModel exceptionResponse = new ExceptionModel();
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionModel> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		ExceptionModel exceptionResponse = new ExceptionModel();
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}