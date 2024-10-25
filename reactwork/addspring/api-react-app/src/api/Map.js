import React, { useState } from "react";
import { Map, MapInfoWindow, MapMarker } from "react-kakao-maps-sdk";
function MapContainer() {


    const [result, setResult] = useState("")
    //좌표를 저장하기 위한 state
    //const [position, setPosition] = useState([])
    const [markers, setMarkers] = useState([]);//maker state
    const [activeMarker, setActiveMarker] = useState(null);//활성화된 마커 state

    const center = {
        // 지도의 중심좌표 lat : 위도 lng : 경도
        lat: 37.49217,
        lng: 126.72407
    }
    const handleMapClick = (event, mouseEvent) => {
        const latlng = mouseEvent.latLng
        setResult(`클릭한 위치의 위도는 ${latlng.getLat()} 이고, 경도는 ${latlng.getLng()} 입니다`,)
        const newMarker = {
            id: markers.length, // 배열의 길이를 id로 설정
            position: {
                lat: latlng.getLat(), //위도
                lng: latlng.getLng() // 경도 
            },
            info: `마커위치 : (${latlng.getLat()},${latlng.getLng()})`
        }
        setMarkers([...markers, newMarker]);
    }

    const handleMouseOver = (id)=>{
      setActiveMarker(id);
    }

    const handleMouseOut = (id)=>{
      setActiveMarker(null);
    }

    return (
        <div>
            <Map
                center={center}
                style={{ width: '600px', height: '600px' }} //지도의 너비와 높이
                level={1} // 지도 확대정도 숫자가 작을수록 크게 , 클수록 작게보임 
                onClick={handleMapClick} // 지도의 클릭 이벤트핸들러 
            >
              {markers.map(marker =>(
                <MapMarker
                  key={marker.id}
                  position={marker.position}
                  onClick={()=> handleMouseOver(marker.id)}
                  onMouseOut={handleMouseOut}
                >
                {activeMarker === marker.id &&(         
                  <div style={{padding: "5px", color:"#000"}}>
                    {marker.info}
                  </div>
                )}
                </MapMarker>
              ))}

            </Map>
            <p>지도를 클릭해주세요</p>
            <p id="result" >{result} </p>

        </div >
    )
}

export default MapContainer