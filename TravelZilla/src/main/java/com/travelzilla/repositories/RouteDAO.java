package com.travelzilla.repositories;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.travelzilla.models.Packages;
import com.travelzilla.models.Route;

@Repository
public interface RouteDAO extends JpaRepository<Route, Integer>{
	
	@Query("select r.packageList from Route r where r.routeFrom=?1 AND r.routeTo=?2")
	public Set<Packages> getAllRouteByFrom_To(String from, String to);
	
	@Query("select r.packageList from Route r where r.routeFrom=?1")
	public Set<Packages> getAllRouteByFrom_To(String from);



	
	public  List<Route> findByRouteFromAndRouteTo(String source, String destination);
	


}
