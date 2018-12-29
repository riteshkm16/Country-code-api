package com.example.projects.countrycode.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.projects.countrycode.countrycode.modals.CountryDetail;
import com.example.projects.countrycode.countrycode.utils.CountryUtil;

public class CountryDetailDB {

	private static List<CountryDetail> countryDetails=new ArrayList<CountryDetail>();
	
	static {
		
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailDB class and the Static function    ---");	
		System.out.println("--------this Static to be executed----------------------------------------------------------------");		
		
		countryDetails.add(new CountryDetail("Afghanistan","+93","AF"));
		countryDetails.add(new CountryDetail("Albania","+355","AL"));
		countryDetails.add(new CountryDetail("Algeria","+213","DZ"));
		countryDetails.add(new CountryDetail("AmericanSamoa","+1 684","AS"));
		countryDetails.add(new CountryDetail("Andorra","+376","AD"));
		countryDetails.add(new CountryDetail("Angola","+244","AO"));
		countryDetails.add(new CountryDetail("Anguilla","+1 264","AI"));
		countryDetails.add(new CountryDetail("Antigua and Barbuda","+1268","AG"));
		countryDetails.add(new CountryDetail("Argentina","+54","AR"));
		countryDetails.add(new CountryDetail("Armenia","+374","AM"));
		countryDetails.add(new CountryDetail("Aruba","+297","AW"));
		countryDetails.add(new CountryDetail("Australia","+61","AU"));
		countryDetails.add(new CountryDetail("Austria","+43","AT"));
		countryDetails.add(new CountryDetail("Azerbaijan","+994","AZ"));
		countryDetails.add(new CountryDetail("Bahamas","+1 242","BS"));
		countryDetails.add(new CountryDetail("Bahrain","+973","BH"));
		countryDetails.add(new CountryDetail("Bangladesh","+880","BD"));
		countryDetails.add(new CountryDetail("Barbados","+1 246","BB"));
		countryDetails.add(new CountryDetail("Belarus","+375","BY"));
		countryDetails.add(new CountryDetail("Belgium","+32","BE"));
		countryDetails.add(new CountryDetail("Belize","+501","BZ"));
		countryDetails.add(new CountryDetail("Benin","+229","BJ"));
		countryDetails.add(new CountryDetail("Bermuda","+1 441","BM"));
		countryDetails.add(new CountryDetail("Bhutan","+975","BT"));
		countryDetails.add(new CountryDetail("Bosnia and Herzegovina","+387","BA"));
		countryDetails.add(new CountryDetail("Botswana","+267","BW"));
		countryDetails.add(new CountryDetail("Brazil","+55","BR"));
		countryDetails.add(new CountryDetail("British Indian Ocean Territory","+246","IO"));
		countryDetails.add(new CountryDetail("Bulgaria","+359","BG"));
		countryDetails.add(new CountryDetail("Burkina Faso","+226","BF"));
		countryDetails.add(new CountryDetail("Burundi","+257","BI"));
		countryDetails.add(new CountryDetail("Cambodia","+855","KH"));
		countryDetails.add(new CountryDetail("Cameroon","+237","CM"));
		countryDetails.add(new CountryDetail("Canada","+1","CA"));
		countryDetails.add(new CountryDetail("Cape Verde","+238","CV"));
		countryDetails.add(new CountryDetail("Cayman Islands","+ 345","KY"));
		countryDetails.add(new CountryDetail("Central African Republic","+236","CF"));
		countryDetails.add(new CountryDetail("Chad","+235","TD"));
		countryDetails.add(new CountryDetail("Chile","+56","CL"));
		countryDetails.add(new CountryDetail("China","+86","CN"));
		countryDetails.add(new CountryDetail("Christmas Island","+61","CX"));
		countryDetails.add(new CountryDetail("Colombia","+57","CO"));
		countryDetails.add(new CountryDetail("Comoros","+269","KM"));
		countryDetails.add(new CountryDetail("Congo","+242","CG"));
		countryDetails.add(new CountryDetail("Cook Islands","+682","CK"));
		countryDetails.add(new CountryDetail("Costa Rica","+506","CR"));
		countryDetails.add(new CountryDetail("Croatia","+385","HR"));
		countryDetails.add(new CountryDetail("Cuba","+53","CU"));
		countryDetails.add(new CountryDetail("Cyprus","+537","CY"));
		countryDetails.add(new CountryDetail("Czech Republic","+420","CZ"));
		countryDetails.add(new CountryDetail("Denmark","+45","DK"));
		countryDetails.add(new CountryDetail("Djibouti","+253","DJ"));
		countryDetails.add(new CountryDetail("Dominica","+1 767","DM"));
		countryDetails.add(new CountryDetail("Dominican Republic","+1 849","DO"));
		countryDetails.add(new CountryDetail("Ecuador","+593","EC"));
		countryDetails.add(new CountryDetail("Egypt","+20","EG"));
		countryDetails.add(new CountryDetail("El Salvador","+503","SV"));
		countryDetails.add(new CountryDetail("Equatorial Guinea","+240","GQ"));
		countryDetails.add(new CountryDetail("Eritrea","+291","ER"));
		countryDetails.add(new CountryDetail("Estonia","+372","EE"));
		countryDetails.add(new CountryDetail("Ethiopia","+251","ET"));
		countryDetails.add(new CountryDetail("Faroe Islands","+298","FO"));
		countryDetails.add(new CountryDetail("Fiji","+679","FJ"));
		countryDetails.add(new CountryDetail("Finland","+358","FI"));
		countryDetails.add(new CountryDetail("France","+33","FR"));
		countryDetails.add(new CountryDetail("French Guiana","+594","GF"));
		countryDetails.add(new CountryDetail("French Polynesia","+689","PF"));
		countryDetails.add(new CountryDetail("Gabon","+241","GA"));
		countryDetails.add(new CountryDetail("Gambia","+220","GM"));
		countryDetails.add(new CountryDetail("Georgia","+995","GE"));
		countryDetails.add(new CountryDetail("Germany","+49","DE"));
		countryDetails.add(new CountryDetail("Ghana","+233","GH"));
		countryDetails.add(new CountryDetail("Gibraltar","+350","GI"));
		countryDetails.add(new CountryDetail("Greece","+30","GR"));
		countryDetails.add(new CountryDetail("Greenland","+299","GL"));
		countryDetails.add(new CountryDetail("Grenada","+1 473","GD"));
		countryDetails.add(new CountryDetail("Guadeloupe","+590","GP"));
		countryDetails.add(new CountryDetail("Guam","+1 671","GU"));
		countryDetails.add(new CountryDetail("Guatemala","+502","GT"));
		countryDetails.add(new CountryDetail("Guinea","+224","GN"));
		countryDetails.add(new CountryDetail("Guinea-Bissau","+245","GW"));
		countryDetails.add(new CountryDetail("Guyana","+595","GY"));
		countryDetails.add(new CountryDetail("Haiti","+509","HT"));
		countryDetails.add(new CountryDetail("Honduras","+504","HN"));
		countryDetails.add(new CountryDetail("Hungary","+36","HU"));
		countryDetails.add(new CountryDetail("Iceland","+354","IS"));
		countryDetails.add(new CountryDetail("India","+91","IN"));
		countryDetails.add(new CountryDetail("Indonesia","+62","ID"));
		countryDetails.add(new CountryDetail("Iraq","+964","IQ"));
		countryDetails.add(new CountryDetail("Ireland","+353","IE"));
		countryDetails.add(new CountryDetail("Israel","+972","IL"));
		countryDetails.add(new CountryDetail("Italy","+39","IT"));
		countryDetails.add(new CountryDetail("Jamaica","+1 876","JM"));
		countryDetails.add(new CountryDetail("Japan","+81","JP"));
		countryDetails.add(new CountryDetail("Jordan","+962","JO"));
		countryDetails.add(new CountryDetail("Kazakhstan","+7 7","KZ"));
		countryDetails.add(new CountryDetail("Kenya","+254","KE"));
		countryDetails.add(new CountryDetail("Kiribati","+686","KI"));
		countryDetails.add(new CountryDetail("Kuwait","+965","KW"));
		countryDetails.add(new CountryDetail("Kyrgyzstan","+996","KG"));
		countryDetails.add(new CountryDetail("Latvia","+371","LV"));
		countryDetails.add(new CountryDetail("Lebanon","+961","LB"));
		countryDetails.add(new CountryDetail("Lesotho","+266","LS"));
		countryDetails.add(new CountryDetail("Liberia","+231","LR"));
		countryDetails.add(new CountryDetail("Liechtenstein","+423","LI"));
		countryDetails.add(new CountryDetail("Lithuania","+370","LT"));
		countryDetails.add(new CountryDetail("Luxembourg","+352","LU"));
		countryDetails.add(new CountryDetail("Madagascar","+261","MG"));
		countryDetails.add(new CountryDetail("Malawi","+265","MW"));
		countryDetails.add(new CountryDetail("Malaysia","+60","MY"));
		countryDetails.add(new CountryDetail("Maldives","+960","MV"));
		countryDetails.add(new CountryDetail("Mali","+223","ML"));
		countryDetails.add(new CountryDetail("Malta","+356","MT"));
		countryDetails.add(new CountryDetail("Marshall Islands","+692","MH"));
		countryDetails.add(new CountryDetail("Martinique","+596","MQ"));
		countryDetails.add(new CountryDetail("Mauritania","+222","MR"));
		countryDetails.add(new CountryDetail("Mauritius","+230","MU"));
		countryDetails.add(new CountryDetail("Mayotte","+262","YT"));
		countryDetails.add(new CountryDetail("Mexico","+52","MX"));
		countryDetails.add(new CountryDetail("Monaco","+377","MC"));
		countryDetails.add(new CountryDetail("Mongolia","+976","MN"));
		countryDetails.add(new CountryDetail("Montenegro","+382","ME"));
		countryDetails.add(new CountryDetail("Montserrat","+1664","MS"));
		countryDetails.add(new CountryDetail("Morocco","+212","MA"));
		countryDetails.add(new CountryDetail("Myanmar","+95","MM"));
		countryDetails.add(new CountryDetail("Namibia","+264","NA"));
		countryDetails.add(new CountryDetail("Nauru","+674","NR"));
		countryDetails.add(new CountryDetail("Nepal","+977","NP"));
		countryDetails.add(new CountryDetail("Netherlands","+31","NL"));
		countryDetails.add(new CountryDetail("Netherlands Antilles","+599","AN"));
		countryDetails.add(new CountryDetail("New Caledonia","+687","NC"));
		countryDetails.add(new CountryDetail("New Zealand","+64","NZ"));
		countryDetails.add(new CountryDetail("Nicaragua","+505","NI"));
		countryDetails.add(new CountryDetail("Niger","+227","NE"));
		countryDetails.add(new CountryDetail("Nigeria","+234","NG"));
		countryDetails.add(new CountryDetail("Niue","+683","NU"));
		countryDetails.add(new CountryDetail("Norfolk Island","+672","NF"));
		countryDetails.add(new CountryDetail("Northern Mariana Islands","+1 670","MP"));
		countryDetails.add(new CountryDetail("Norway","+47","NO"));
		countryDetails.add(new CountryDetail("Oman","+968","OM"));
		countryDetails.add(new CountryDetail("Pakistan","+92","PK"));
		countryDetails.add(new CountryDetail("Palau","+680","PW"));
		countryDetails.add(new CountryDetail("Panama","+507","PA"));
		countryDetails.add(new CountryDetail("Papua New Guinea","+675","PG"));
		countryDetails.add(new CountryDetail("Paraguay","+595","PY"));
		countryDetails.add(new CountryDetail("Peru","+51","PE"));
		countryDetails.add(new CountryDetail("Philippines","+63","PH"));
		countryDetails.add(new CountryDetail("Poland","+48","PL"));
		countryDetails.add(new CountryDetail("Portugal","+351","PT"));
		countryDetails.add(new CountryDetail("Puerto Rico","+1 939","PR"));
		countryDetails.add(new CountryDetail("Qatar","+974","QA"));
		countryDetails.add(new CountryDetail("Romania","+40","RO"));
		countryDetails.add(new CountryDetail("Rwanda","+250","RW"));
		countryDetails.add(new CountryDetail("Samoa","+685","WS"));
		countryDetails.add(new CountryDetail("San Marino","+378","SM"));
		countryDetails.add(new CountryDetail("Saudi Arabia","+966","SA"));
		countryDetails.add(new CountryDetail("Senegal","+221","SN"));
		countryDetails.add(new CountryDetail("Serbia","+381","RS"));
		countryDetails.add(new CountryDetail("Seychelles","+248","SC"));
		countryDetails.add(new CountryDetail("Sierra Leone","+232","SL"));
		countryDetails.add(new CountryDetail("Singapore","+65","SG"));
		countryDetails.add(new CountryDetail("Slovakia","+421","SK"));
		countryDetails.add(new CountryDetail("Slovenia","+386","SI"));
		countryDetails.add(new CountryDetail("Solomon Islands","+677","SB"));
		countryDetails.add(new CountryDetail("South Africa","+27","ZA"));
		countryDetails.add(new CountryDetail("South Georgia and the South Sandwich Islands","+500","GS"));
		countryDetails.add(new CountryDetail("Spain","+34","ES"));
		countryDetails.add(new CountryDetail("Sri Lanka","+94","LK"));
		countryDetails.add(new CountryDetail("Sudan","+249","SD"));
		countryDetails.add(new CountryDetail("Suriname","+597","SR"));
		countryDetails.add(new CountryDetail("Swaziland","+268","SZ"));
		countryDetails.add(new CountryDetail("Sweden","+46","SE"));
		countryDetails.add(new CountryDetail("Switzerland","+41","CH"));
		countryDetails.add(new CountryDetail("Tajikistan","+992","TJ"));
		countryDetails.add(new CountryDetail("Thailand","+66","TH"));
		countryDetails.add(new CountryDetail("Togo","+228","TG"));
		countryDetails.add(new CountryDetail("Tokelau","+690","TK"));
		countryDetails.add(new CountryDetail("Tonga","+676","TO"));
		countryDetails.add(new CountryDetail("Trinidad and Tobago","+1 868","TT"));
		countryDetails.add(new CountryDetail("Tunisia","+216","TN"));
		countryDetails.add(new CountryDetail("Turkey","+90","TR"));
		countryDetails.add(new CountryDetail("Turkmenistan","+993","TM"));
		countryDetails.add(new CountryDetail("Turks and Caicos Islands","+1 649","TC"));
		countryDetails.add(new CountryDetail("Tuvalu","+688","TV"));
		countryDetails.add(new CountryDetail("Uganda","+256","UG"));
		countryDetails.add(new CountryDetail("Ukraine","+380","UA"));
		countryDetails.add(new CountryDetail("United Arab Emirates","+971","AE"));
		countryDetails.add(new CountryDetail("United Kingdom","+44","GB"));
		countryDetails.add(new CountryDetail("United States","+1","US"));
		countryDetails.add(new CountryDetail("Uruguay","+598","UY"));
		countryDetails.add(new CountryDetail("Uzbekistan","+998","UZ"));
		countryDetails.add(new CountryDetail("Vanuatu","+678","VU"));
		countryDetails.add(new CountryDetail("Wallis and Futuna","+681","WF"));
		countryDetails.add(new CountryDetail("Yemen","+967","YE"));
		countryDetails.add(new CountryDetail("Zambia","+260","ZM"));
		countryDetails.add(new CountryDetail("Zimbabwe","+263","ZW"));
		countryDetails.add(new CountryDetail("land Islands","","AX"));
		countryDetails.add(new CountryDetail("Antarctica",":null,","AQ"));
		countryDetails.add(new CountryDetail("Bolivia, Plurinational State of","+591","BO"));
		countryDetails.add(new CountryDetail("Brunei Darussalam","+673","BN"));
		countryDetails.add(new CountryDetail("Cocos (Keeling) Islands","+61","CC"));
		countryDetails.add(new CountryDetail("Congo, The Democratic Republic of the","+243","CD"));
		countryDetails.add(new CountryDetail("Cote d'Ivoire","+225","CI"));
		countryDetails.add(new CountryDetail("Falkland Islands (Malvinas)","+500","FK"));
		countryDetails.add(new CountryDetail("Guernsey","+44","GG"));
		countryDetails.add(new CountryDetail("Holy See (Vatican City State)","+379","VA"));
		countryDetails.add(new CountryDetail("Hong Kong","+852","HK"));
		countryDetails.add(new CountryDetail("Iran, Islamic Republic of","+98","IR"));
		countryDetails.add(new CountryDetail("Isle of Man","+44","IM"));
		countryDetails.add(new CountryDetail("Jersey","+44","JE"));
		countryDetails.add(new CountryDetail("Korea, Democratic People's Republic of","+850","KP"));
		countryDetails.add(new CountryDetail("Korea, Republic of","+82","KR"));
		countryDetails.add(new CountryDetail("Lao People's Democratic Republic","+856","LA"));
		countryDetails.add(new CountryDetail("Libyan Arab Jamahiriya","+218","LY"));
		countryDetails.add(new CountryDetail("Macao","+853","MO"));
		countryDetails.add(new CountryDetail("Macedonia, The Former Yugoslav Republic of","+389","MK"));
		countryDetails.add(new CountryDetail("Micronesia, Federated States of","+691","FM"));
		countryDetails.add(new CountryDetail("Moldova, Republic of","+373","MD"));
		countryDetails.add(new CountryDetail("Mozambique","+258","MZ"));
		countryDetails.add(new CountryDetail("Palestinian Territory, Occupied","+970","PS"));
		countryDetails.add(new CountryDetail("Pitcairn","+872","PN"));
		countryDetails.add(new CountryDetail("Réunion","+262","RE"));
		countryDetails.add(new CountryDetail("Russia","+7","RU"));
		countryDetails.add(new CountryDetail("Saint Barthélemy","+590","BL"));
		countryDetails.add(new CountryDetail("Saint Helena, Ascension and Tristan Da Cunha","+290","SH"));
		countryDetails.add(new CountryDetail("Saint Kitts and Nevis","+1 869","KN"));
		countryDetails.add(new CountryDetail("Saint Lucia","+1 758","LC"));
		countryDetails.add(new CountryDetail("Saint Martin","+590","MF"));
		countryDetails.add(new CountryDetail("Saint Pierre and Miquelon","+508","PM"));
		countryDetails.add(new CountryDetail("Saint Vincent and the Grenadines","+1 784","VC"));
		countryDetails.add(new CountryDetail("Sao Tome and Principe","+239","ST"));
		countryDetails.add(new CountryDetail("Somalia","+252","SO"));
		countryDetails.add(new CountryDetail("Svalbard and Jan Mayen","+47","SJ"));
		countryDetails.add(new CountryDetail("Syrian Arab Republic","+963","SY"));
		countryDetails.add(new CountryDetail("Taiwan, Province of China","+886","TW"));
		countryDetails.add(new CountryDetail("Tanzania, United Republic of","+255","TZ"));
		countryDetails.add(new CountryDetail("Timor-Leste","+670","TL"));
		countryDetails.add(new CountryDetail("Venezuela, Bolivarian Republic of","+58","VE"));
		countryDetails.add(new CountryDetail("Viet Nam","+84","VN"));
		countryDetails.add(new CountryDetail("Virgin Islands, British","+1 284","VG"));
	
	}


	public static List<CountryDetail> findAll() {
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailDB class and the findAll function    ---");
		return CountryDetailDB.countryDetails;
	}
	
	
	public static CountryDetail findByName(String name)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailDB class and the findByName function    ---");
		CountryDetail countryDetail=null;
		for(CountryDetail cd:CountryDetailDB.countryDetails)
		{
			if(name.equalsIgnoreCase(cd.getName()))
			{
				countryDetail=cd;
				break;
			}
		}
		return countryDetail;
	}
	
	
	public static CountryDetail findByCode(String code)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailDB class and the findByCode function    ---");
		CountryDetail countryDetail=null;
		for(CountryDetail cd:CountryDetailDB.countryDetails)
		{
			if(code.equalsIgnoreCase(cd.getCode()))
			{
				countryDetail=cd;
				break;
			}
		}
		return countryDetail;
	}
	
	
	public static CountryDetail findByDialCode(String dialCode)
	{
		System.out.println(CountryUtil.getTime()+"  [LOG]: ---  In the CountryDetailDB class and the findByCode function    ---");
		CountryDetail countryDetail=null;
		for(CountryDetail cd:CountryDetailDB.countryDetails)
		{
			if(dialCode.equalsIgnoreCase(cd.getDialCode()))
			{
				countryDetail=cd;
				break;
			}
		}			
		return countryDetail;
	}

	
}
