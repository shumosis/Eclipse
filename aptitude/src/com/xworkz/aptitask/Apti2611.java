package com.xworkz.aptitask;

public class Apti2611 {

	public static void main(String[] args) {
		
		function likes (names) {
			  var templates = [
			    'no one likes this',
			    '{name} likes this',
			    '{name} and {name} like this',
			    '{name}, {name} and {name} like this',
			    '{name}, {name} and {n} others like this'
			  ];
			  var idx = Math.min(names.length, 4);
			  
			  return templates[idx].replace(/{name}|{n}/g, function (val) {
			    return val === '{name}' ? names.shift() : names.length;
			  });
			}
		
		function likes(names) {
			  if(Array.isArray(names)){
			   
			   return names.length > 3 ? names.slice(0,2).join(', ') + ' and ' + (names.length - 2) +' others like this'
			        : names.length === 3 ? names.slice(0,2).join(', ') + ' and ' + names[2] + ' like this'
			        : names.length === 2 ? names.join(' and ') + ' like this'
			        : names.length === 1 ? names[0] + ' likes this' : 'no one likes this'
			  } else {
			    throw 'params must be a array.'
			  }

	}

}
