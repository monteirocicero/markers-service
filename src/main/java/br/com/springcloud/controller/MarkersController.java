package br.com.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.springcloud.model.Position;

@Controller
@RequestMapping("/markers")
public class MarkersController {

	@RequestMapping(method = RequestMethod.GET)
	public List<Position> getMarkers() {
		List<Position> positions = new ArrayList();
		Position eiffelTower = new Position(48.858292, 2.294347);
		positions.add(eiffelTower);
		return positions;
	}

}
