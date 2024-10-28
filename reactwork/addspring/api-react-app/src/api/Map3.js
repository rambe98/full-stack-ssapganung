import React, { useEffect, useState } from 'react';  // React, useEffect, useState 훅을 불러옴
import { useDaumPostcodePopup } from "react-daum-postcode";
import { Map, MapInfoWindow, MapMarker } from "react-kakao-maps-sdk";

export default function MapContainer3() {
    
    const [address, setAddress] = useState('');
    const [position, setPosition] = useState(null);
    //{lng:126.978649,lat:37.5668354}
    
    // Daum 우편번호 API 스크립트 URL
    let scriptUrl = 'https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js'

    // react-daum-postcode의 useDaumPostcodePopup 훅을 사용하여 API를 팝업으로 실행할 준비
    const open = useDaumPostcodePopup(scriptUrl);

    let geoCoder = new window.kakao.maps.services.Geocoder();

    // Daum Postcode API에서 주소 선택 완료 후 실행되는 함수
    const handleComplete = (data) => {
        let addr = data.address; // 주소 변수
        setAddress(addr);
        geoCoder.addressSearch(data.address,function(results,status){
            if(status === window.kakao.maps.services.Status.OK){
                let result = results[0];
                setPosition({lng: result.x,lat:result.y})
            }
        })
    }


    // 팝업을 열고 완료 시 handleComplete 함수 실행
    function handleClick() {
        open({ onComplete: handleComplete });
    };


    return(
        <div>
            {position!== null &&(<Map
                center={{lat:position.lat,lng:position.lng}}
                style={{ width: '600px', height: '600px' }} //지도의 너비와 높이
                level={1} // 지도 확대정도 숫자가 작을수록 크게 , 클수록 작게보임 
                //onClick={handleMapClick} // 지도의 클릭 이벤트핸들러 
            >
                <MapMarker position={position}/>
            </Map>)}
            <input type='text' value={address} placeholder='주소' readOnly/>
            <input type='button' onClick={handleClick} value='주소 검색'/>
        </div>
    );
}