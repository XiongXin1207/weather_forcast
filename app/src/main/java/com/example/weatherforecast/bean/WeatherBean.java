package com.example.weatherforecast.bean;


import com.google.gson.annotations.SerializedName;

public class WeatherBean {

    /**
     * data : {"air":{"aqi":38,"aqi_level":1,"aqi_name":"优","co":"0.4","no2":"19","o3":"43","pm10":"38","pm2.5":"13","so2":"3","update_time":"20210104100000"},"alarm":{},"forecast_24h":{"0":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-1","min_degree":"-8","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-03"},"1":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-1","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-04"},"2":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-2","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西北风","night_wind_direction_code":"7","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-05"},"3":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"5","day_wind_power_code":"2","max_degree":"-8","min_degree":"-15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-06"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-7","min_degree":"-13","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-07"},"5":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-3","min_degree":"-12","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-08"},"6":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"0","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-09"},"7":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"1","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西风","night_wind_direction_code":"6","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-10"}},"index":{"airconditioner":{"detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜","name":"洗车"},"chill":{"detail":"感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷","name":"风寒"},"clothes":{"detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷","name":"穿衣"},"cold":{"detail":"天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发","name":"感冒"},"comfort":{"detail":"白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。","info":"较差","name":"心情"},"morning":{"detail":"风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。","info":"较不宜","name":"晨练"},"sports":{"detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天根据户外光线情况，适时佩戴太阳镜","info":"需要","name":"太阳镜"},"sunscreen":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱","name":"防晒"},"time":"20210104","tourism":{"detail":"天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。","info":"一般","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱","name":"紫外线强度"},"umbrella":{"detail":"天气较好，不会降水，因此您可放心出门，无须带雨伞。","info":"不带伞","name":"雨伞"}},"observe":{"degree":"-1","humidity":"24","precipitation":"0","pressure":"1030","update_time":"202101041040","weather":"多云","weather_code":"01","weather_short":"多云","wind_direction":"7","wind_power":"3"},"rise":{"0":{"sunrise":"07:36","sunset":"17:02","time":"20210104"},"1":{"sunrise":"07:36","sunset":"17:03","time":"20210105"},"10":{"sunrise":"07:34","sunset":"17:12","time":"20210114"},"11":{"sunrise":"07:33","sunset":"17:13","time":"20210115"},"12":{"sunrise":"07:33","sunset":"17:14","time":"20210116"},"13":{"sunrise":"07:33","sunset":"17:15","time":"20210117"},"14":{"sunrise":"07:32","sunset":"17:17","time":"20210118"},"15":{"sunrise":"","sunset":"","time":"20210103"},"2":{"sunrise":"07:35","sunset":"17:04","time":"20210106"},"3":{"sunrise":"07:35","sunset":"17:05","time":"20210107"},"4":{"sunrise":"07:35","sunset":"17:06","time":"20210108"},"5":{"sunrise":"07:35","sunset":"17:07","time":"20210109"},"6":{"sunrise":"07:35","sunset":"17:08","time":"20210110"},"7":{"sunrise":"07:35","sunset":"17:09","time":"20210111"},"8":{"sunrise":"07:34","sunset":"17:10","time":"20210112"},"9":{"sunrise":"07:34","sunset":"17:11","time":"20210113"}},"tips":{"observe":{"0":"光芒透过云缝，洒向大地~","1":"天冷了，多穿点衣服~"}}}
     * message : OK
     * status : 200
     */

    private DataDTO data;
    private String message;
    private int status;

    public DataDTO getData() {
        return data;
    }

    public void setData(DataDTO data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static class DataDTO {
        /**
         * air : {"aqi":38,"aqi_level":1,"aqi_name":"优","co":"0.4","no2":"19","o3":"43","pm10":"38","pm2.5":"13","so2":"3","update_time":"20210104100000"}
         * alarm : {}
         * forecast_24h : {"0":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-1","min_degree":"-8","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-03"},"1":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-1","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-04"},"2":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-2","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西北风","night_wind_direction_code":"7","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-05"},"3":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"5","day_wind_power_code":"2","max_degree":"-8","min_degree":"-15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-06"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-7","min_degree":"-13","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-07"},"5":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-3","min_degree":"-12","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-08"},"6":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"0","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-09"},"7":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"1","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西风","night_wind_direction_code":"6","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-10"}}
         * index : {"airconditioner":{"detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜","name":"洗车"},"chill":{"detail":"感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷","name":"风寒"},"clothes":{"detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷","name":"穿衣"},"cold":{"detail":"天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发","name":"感冒"},"comfort":{"detail":"白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。","info":"较差","name":"心情"},"morning":{"detail":"风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。","info":"较不宜","name":"晨练"},"sports":{"detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天根据户外光线情况，适时佩戴太阳镜","info":"需要","name":"太阳镜"},"sunscreen":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱","name":"防晒"},"time":"20210104","tourism":{"detail":"天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。","info":"一般","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱","name":"紫外线强度"},"umbrella":{"detail":"天气较好，不会降水，因此您可放心出门，无须带雨伞。","info":"不带伞","name":"雨伞"}}
         * observe : {"degree":"-1","humidity":"24","precipitation":"0","pressure":"1030","update_time":"202101041040","weather":"多云","weather_code":"01","weather_short":"多云","wind_direction":"7","wind_power":"3"}
         * rise : {"0":{"sunrise":"07:36","sunset":"17:02","time":"20210104"},"1":{"sunrise":"07:36","sunset":"17:03","time":"20210105"},"10":{"sunrise":"07:34","sunset":"17:12","time":"20210114"},"11":{"sunrise":"07:33","sunset":"17:13","time":"20210115"},"12":{"sunrise":"07:33","sunset":"17:14","time":"20210116"},"13":{"sunrise":"07:33","sunset":"17:15","time":"20210117"},"14":{"sunrise":"07:32","sunset":"17:17","time":"20210118"},"15":{"sunrise":"","sunset":"","time":"20210103"},"2":{"sunrise":"07:35","sunset":"17:04","time":"20210106"},"3":{"sunrise":"07:35","sunset":"17:05","time":"20210107"},"4":{"sunrise":"07:35","sunset":"17:06","time":"20210108"},"5":{"sunrise":"07:35","sunset":"17:07","time":"20210109"},"6":{"sunrise":"07:35","sunset":"17:08","time":"20210110"},"7":{"sunrise":"07:35","sunset":"17:09","time":"20210111"},"8":{"sunrise":"07:34","sunset":"17:10","time":"20210112"},"9":{"sunrise":"07:34","sunset":"17:11","time":"20210113"}}
         * tips : {"observe":{"0":"光芒透过云缝，洒向大地~","1":"天冷了，多穿点衣服~"}}
         */

        private AirDTO air;
        private AlarmDTO alarm;
        private Forecast24hDTO forecast_24h;
        private IndexDTO index;
        private ObserveDTO observe;
        private RiseDTO rise;
        private TipsDTO tips;

        public AirDTO getAir() {
            return air;
        }

        public void setAir(AirDTO air) {
            this.air = air;
        }

        public AlarmDTO getAlarm() {
            return alarm;
        }

        public void setAlarm(AlarmDTO alarm) {
            this.alarm = alarm;
        }

        public Forecast24hDTO getForecast_24h() {
            return forecast_24h;
        }

        public void setForecast_24h(Forecast24hDTO forecast_24h) {
            this.forecast_24h = forecast_24h;
        }

        public IndexDTO getIndex() {
            return index;
        }

        public void setIndex(IndexDTO index) {
            this.index = index;
        }

        public ObserveDTO getObserve() {
            return observe;
        }

        public void setObserve(ObserveDTO observe) {
            this.observe = observe;
        }

        public RiseDTO getRise() {
            return rise;
        }

        public void setRise(RiseDTO rise) {
            this.rise = rise;
        }

        public TipsDTO getTips() {
            return tips;
        }

        public void setTips(TipsDTO tips) {
            this.tips = tips;
        }

        public static class AirDTO {
            /**
             * aqi : 38
             * aqi_level : 1
             * aqi_name : 优
             * co : 0.4
             * no2 : 19
             * o3 : 43
             * pm10 : 38
             * pm2.5 : 13
             * so2 : 3
             * update_time : 20210104100000
             */

            private int aqi;
            private int aqi_level;
            private String aqi_name;
            private String co;
            private String no2;
            private String o3;
            private String pm10;
            @SerializedName("pm2.5")
            private String _$Pm25177;// FIXME check this code
            private String so2;
            private String update_time;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public int getAqi_level() {
                return aqi_level;
            }

            public void setAqi_level(int aqi_level) {
                this.aqi_level = aqi_level;
            }

            public String getAqi_name() {
                return aqi_name;
            }

            public void setAqi_name(String aqi_name) {
                this.aqi_name = aqi_name;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String get_$Pm25177() {
                return _$Pm25177;
            }

            public void set_$Pm25177(String _$Pm25177) {
                this._$Pm25177 = _$Pm25177;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }
        }

        public static class AlarmDTO {
        }

        public static class Forecast24hDTO {
            /**
             * 0 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-1","min_degree":"-8","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-03"}
             * 1 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-1","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-04"}
             * 2 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-2","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西北风","night_wind_direction_code":"7","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-05"}
             * 3 : {"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"5","day_wind_power_code":"2","max_degree":"-8","min_degree":"-15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-06"}
             * 4 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-7","min_degree":"-13","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-07"}
             * 5 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-3","min_degree":"-12","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-08"}
             * 6 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"0","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-09"}
             * 7 : {"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"1","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西风","night_wind_direction_code":"6","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-10"}
             */

            @SerializedName("0")
            private _$0DTO _$0;
            @SerializedName("1")
            private _$1DTO _$1;
            @SerializedName("2")
            private _$2DTO _$2;
            @SerializedName("3")
            private _$3DTO _$3;
            @SerializedName("4")
            private _$4DTO _$4;
            @SerializedName("5")
            private _$5DTO _$5;
            @SerializedName("6")
            private _$6DTO _$6;
            @SerializedName("7")
            private _$7DTO _$7;

            public _$0DTO get_$0() {
                return _$0;
            }

            public void set_$0(_$0DTO _$0) {
                this._$0 = _$0;
            }

            public _$1DTO get_$1() {
                return _$1;
            }

            public void set_$1(_$1DTO _$1) {
                this._$1 = _$1;
            }

            public _$2DTO get_$2() {
                return _$2;
            }

            public void set_$2(_$2DTO _$2) {
                this._$2 = _$2;
            }

            public _$3DTO get_$3() {
                return _$3;
            }

            public void set_$3(_$3DTO _$3) {
                this._$3 = _$3;
            }

            public _$4DTO get_$4() {
                return _$4;
            }

            public void set_$4(_$4DTO _$4) {
                this._$4 = _$4;
            }

            public _$5DTO get_$5() {
                return _$5;
            }

            public void set_$5(_$5DTO _$5) {
                this._$5 = _$5;
            }

            public _$6DTO get_$6() {
                return _$6;
            }

            public void set_$6(_$6DTO _$6) {
                this._$6 = _$6;
            }

            public _$7DTO get_$7() {
                return _$7;
            }

            public void set_$7(_$7DTO _$7) {
                this._$7 = _$7;
            }

            public static class _$0DTO {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 西南风
                 * day_wind_direction_code : 5
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : -1
                 * min_degree : -8
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-03
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1DTO {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 4
                 * day_wind_power_code : 1
                 * max_degree : -1
                 * min_degree : -11
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-04
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2DTO {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 西南风
                 * day_wind_direction_code : 5
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : -2
                 * min_degree : -11
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 西北风
                 * night_wind_direction_code : 7
                 * night_wind_power : 4
                 * night_wind_power_code : 1
                 * time : 2021-01-05
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3DTO {
                /**
                 * day_weather : 多云
                 * day_weather_code : 01
                 * day_weather_short : 多云
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 5
                 * day_wind_power_code : 2
                 * max_degree : -8
                 * min_degree : -15
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 4
                 * night_wind_power_code : 1
                 * time : 2021-01-06
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4DTO {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 4
                 * day_wind_power_code : 1
                 * max_degree : -7
                 * min_degree : -13
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-07
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5DTO {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 4
                 * day_wind_power_code : 1
                 * max_degree : -3
                 * min_degree : -12
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-08
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6DTO {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 4
                 * day_wind_power_code : 1
                 * max_degree : 0
                 * min_degree : -11
                 * night_weather : 晴
                 * night_weather_code : 00
                 * night_weather_short : 晴
                 * night_wind_direction : 北风
                 * night_wind_direction_code : 8
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-09
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7DTO {
                /**
                 * day_weather : 晴
                 * day_weather_code : 00
                 * day_weather_short : 晴
                 * day_wind_direction : 西北风
                 * day_wind_direction_code : 7
                 * day_wind_power : 3
                 * day_wind_power_code : 0
                 * max_degree : 1
                 * min_degree : -11
                 * night_weather : 多云
                 * night_weather_code : 01
                 * night_weather_short : 多云
                 * night_wind_direction : 西风
                 * night_wind_direction_code : 6
                 * night_wind_power : 3
                 * night_wind_power_code : 0
                 * time : 2021-01-10
                 */

                private String day_weather;
                private String day_weather_code;
                private String day_weather_short;
                private String day_wind_direction;
                private String day_wind_direction_code;
                private String day_wind_power;
                private String day_wind_power_code;
                private String max_degree;
                private String min_degree;
                private String night_weather;
                private String night_weather_code;
                private String night_weather_short;
                private String night_wind_direction;
                private String night_wind_direction_code;
                private String night_wind_power;
                private String night_wind_power_code;
                private String time;

                public String getDay_weather() {
                    return day_weather;
                }

                public void setDay_weather(String day_weather) {
                    this.day_weather = day_weather;
                }

                public String getDay_weather_code() {
                    return day_weather_code;
                }

                public void setDay_weather_code(String day_weather_code) {
                    this.day_weather_code = day_weather_code;
                }

                public String getDay_weather_short() {
                    return day_weather_short;
                }

                public void setDay_weather_short(String day_weather_short) {
                    this.day_weather_short = day_weather_short;
                }

                public String getDay_wind_direction() {
                    return day_wind_direction;
                }

                public void setDay_wind_direction(String day_wind_direction) {
                    this.day_wind_direction = day_wind_direction;
                }

                public String getDay_wind_direction_code() {
                    return day_wind_direction_code;
                }

                public void setDay_wind_direction_code(String day_wind_direction_code) {
                    this.day_wind_direction_code = day_wind_direction_code;
                }

                public String getDay_wind_power() {
                    return day_wind_power;
                }

                public void setDay_wind_power(String day_wind_power) {
                    this.day_wind_power = day_wind_power;
                }

                public String getDay_wind_power_code() {
                    return day_wind_power_code;
                }

                public void setDay_wind_power_code(String day_wind_power_code) {
                    this.day_wind_power_code = day_wind_power_code;
                }

                public String getMax_degree() {
                    return max_degree;
                }

                public void setMax_degree(String max_degree) {
                    this.max_degree = max_degree;
                }

                public String getMin_degree() {
                    return min_degree;
                }

                public void setMin_degree(String min_degree) {
                    this.min_degree = min_degree;
                }

                public String getNight_weather() {
                    return night_weather;
                }

                public void setNight_weather(String night_weather) {
                    this.night_weather = night_weather;
                }

                public String getNight_weather_code() {
                    return night_weather_code;
                }

                public void setNight_weather_code(String night_weather_code) {
                    this.night_weather_code = night_weather_code;
                }

                public String getNight_weather_short() {
                    return night_weather_short;
                }

                public void setNight_weather_short(String night_weather_short) {
                    this.night_weather_short = night_weather_short;
                }

                public String getNight_wind_direction() {
                    return night_wind_direction;
                }

                public void setNight_wind_direction(String night_wind_direction) {
                    this.night_wind_direction = night_wind_direction;
                }

                public String getNight_wind_direction_code() {
                    return night_wind_direction_code;
                }

                public void setNight_wind_direction_code(String night_wind_direction_code) {
                    this.night_wind_direction_code = night_wind_direction_code;
                }

                public String getNight_wind_power() {
                    return night_wind_power;
                }

                public void setNight_wind_power(String night_wind_power) {
                    this.night_wind_power = night_wind_power;
                }

                public String getNight_wind_power_code() {
                    return night_wind_power_code;
                }

                public void setNight_wind_power_code(String night_wind_power_code) {
                    this.night_wind_power_code = night_wind_power_code;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class IndexDTO {
            /**
             * airconditioner : {"detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调","name":"空调开启"}
             * allergy : {"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"}
             * carwash : {"detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜","name":"洗车"}
             * chill : {"detail":"感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷","name":"风寒"}
             * clothes : {"detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷","name":"穿衣"}
             * cold : {"detail":"天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发","name":"感冒"}
             * comfort : {"detail":"白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。","info":"很不舒适","name":"舒适度"}
             * diffusion : {"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"}
             * dry : {"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"}
             * drying : {"detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜","name":"晾晒"}
             * fish : {"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"}
             * heatstroke : {"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"}
             * makeup : {"detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿","name":"化妆"}
             * mood : {"detail":"天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。","info":"较差","name":"心情"}
             * morning : {"detail":"风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。","info":"较不宜","name":"晨练"}
             * sports : {"detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜","name":"运动"}
             * sunglasses : {"detail":"白天根据户外光线情况，适时佩戴太阳镜","info":"需要","name":"太阳镜"}
             * sunscreen : {"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱","name":"防晒"}
             * time : 20210104
             * tourism : {"detail":"天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。","info":"一般","name":"旅游"}
             * traffic : {"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"}
             * ultraviolet : {"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱","name":"紫外线强度"}
             * umbrella : {"detail":"天气较好，不会降水，因此您可放心出门，无须带雨伞。","info":"不带伞","name":"雨伞"}
             */

            private AirconditionerDTO airconditioner;
            private AllergyDTO allergy;
            private CarwashDTO carwash;
            private ChillDTO chill;
            private ClothesDTO clothes;
            private ColdDTO cold;
            private ComfortDTO comfort;
            private DiffusionDTO diffusion;
            private DryDTO dry;
            private DryingDTO drying;
            private FishDTO fish;
            private HeatstrokeDTO heatstroke;
            private MakeupDTO makeup;
            private MoodDTO mood;
            private MorningDTO morning;
            private SportsDTO sports;
            private SunglassesDTO sunglasses;
            private SunscreenDTO sunscreen;
            private String time;
            private TourismDTO tourism;
            private TrafficDTO traffic;
            private UltravioletDTO ultraviolet;
            private UmbrellaDTO umbrella;

            public AirconditionerDTO getAirconditioner() {
                return airconditioner;
            }

            public void setAirconditioner(AirconditionerDTO airconditioner) {
                this.airconditioner = airconditioner;
            }

            public AllergyDTO getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyDTO allergy) {
                this.allergy = allergy;
            }

            public CarwashDTO getCarwash() {
                return carwash;
            }

            public void setCarwash(CarwashDTO carwash) {
                this.carwash = carwash;
            }

            public ChillDTO getChill() {
                return chill;
            }

            public void setChill(ChillDTO chill) {
                this.chill = chill;
            }

            public ClothesDTO getClothes() {
                return clothes;
            }

            public void setClothes(ClothesDTO clothes) {
                this.clothes = clothes;
            }

            public ColdDTO getCold() {
                return cold;
            }

            public void setCold(ColdDTO cold) {
                this.cold = cold;
            }

            public ComfortDTO getComfort() {
                return comfort;
            }

            public void setComfort(ComfortDTO comfort) {
                this.comfort = comfort;
            }

            public DiffusionDTO getDiffusion() {
                return diffusion;
            }

            public void setDiffusion(DiffusionDTO diffusion) {
                this.diffusion = diffusion;
            }

            public DryDTO getDry() {
                return dry;
            }

            public void setDry(DryDTO dry) {
                this.dry = dry;
            }

            public DryingDTO getDrying() {
                return drying;
            }

            public void setDrying(DryingDTO drying) {
                this.drying = drying;
            }

            public FishDTO getFish() {
                return fish;
            }

            public void setFish(FishDTO fish) {
                this.fish = fish;
            }

            public HeatstrokeDTO getHeatstroke() {
                return heatstroke;
            }

            public void setHeatstroke(HeatstrokeDTO heatstroke) {
                this.heatstroke = heatstroke;
            }

            public MakeupDTO getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupDTO makeup) {
                this.makeup = makeup;
            }

            public MoodDTO getMood() {
                return mood;
            }

            public void setMood(MoodDTO mood) {
                this.mood = mood;
            }

            public MorningDTO getMorning() {
                return morning;
            }

            public void setMorning(MorningDTO morning) {
                this.morning = morning;
            }

            public SportsDTO getSports() {
                return sports;
            }

            public void setSports(SportsDTO sports) {
                this.sports = sports;
            }

            public SunglassesDTO getSunglasses() {
                return sunglasses;
            }

            public void setSunglasses(SunglassesDTO sunglasses) {
                this.sunglasses = sunglasses;
            }

            public SunscreenDTO getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenDTO sunscreen) {
                this.sunscreen = sunscreen;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public TourismDTO getTourism() {
                return tourism;
            }

            public void setTourism(TourismDTO tourism) {
                this.tourism = tourism;
            }

            public TrafficDTO getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficDTO traffic) {
                this.traffic = traffic;
            }

            public UltravioletDTO getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(UltravioletDTO ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public UmbrellaDTO getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaDTO umbrella) {
                this.umbrella = umbrella;
            }

            public static class AirconditionerDTO {
                /**
                 * detail : 您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。
                 * info : 开启制暖空调
                 * name : 空调开启
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class AllergyDTO {
                /**
                 * detail : 天气条件极不易诱发过敏。
                 * info : 极不易发
                 * name : 过敏
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CarwashDTO {
                /**
                 * detail : 较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。
                 * info : 较不宜
                 * name : 洗车
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ChillDTO {
                /**
                 * detail : 感觉寒冷，室外活动要注意保暖，可戴手套与帽子。
                 * info : 寒冷
                 * name : 风寒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ClothesDTO {
                /**
                 * detail : 天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。
                 * info : 寒冷
                 * name : 穿衣
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ColdDTO {
                /**
                 * detail : 天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。
                 * info : 易发
                 * name : 感冒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ComfortDTO {
                /**
                 * detail : 白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。
                 * info : 很不舒适
                 * name : 舒适度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DiffusionDTO {
                /**
                 * detail : 气象条件有利于空气污染物稀释、扩散和清除。
                 * info : 良
                 * name : 空气污染扩散条件
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryDTO {
                /**
                 * detail : 天气较好，路面比较干燥，路况较好。
                 * info : 干燥
                 * name : 路况
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class DryingDTO {
                /**
                 * detail : 天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。
                 * info : 基本适宜
                 * name : 晾晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class FishDTO {
                /**
                 * detail : 较适合垂钓，但风力稍大，会对垂钓产生一定的影响。
                 * info : 较适宜
                 * name : 钓鱼
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class HeatstrokeDTO {
                /**
                 * detail : 天气舒适，对易中暑人群来说非常友善。
                 * info : 无中暑风险
                 * name : 中暑
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MakeupDTO {
                /**
                 * detail : 天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。
                 * info : 保湿
                 * name : 化妆
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MoodDTO {
                /**
                 * detail : 天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。
                 * info : 较差
                 * name : 心情
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class MorningDTO {
                /**
                 * detail : 风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。
                 * info : 较不宜
                 * name : 晨练
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SportsDTO {
                /**
                 * detail : 天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。
                 * info : 较不宜
                 * name : 运动
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunglassesDTO {
                /**
                 * detail : 白天根据户外光线情况，适时佩戴太阳镜
                 * info : 需要
                 * name : 太阳镜
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class SunscreenDTO {
                /**
                 * detail : 紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。
                 * info : 较弱
                 * name : 防晒
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TourismDTO {
                /**
                 * detail : 天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。
                 * info : 一般
                 * name : 旅游
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class TrafficDTO {
                /**
                 * detail : 天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。
                 * info : 良好
                 * name : 交通
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UltravioletDTO {
                /**
                 * detail : 紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。
                 * info : 弱
                 * name : 紫外线强度
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class UmbrellaDTO {
                /**
                 * detail : 天气较好，不会降水，因此您可放心出门，无须带雨伞。
                 * info : 不带伞
                 * name : 雨伞
                 */

                private String detail;
                private String info;
                private String name;

                public String getDetail() {
                    return detail;
                }

                public void setDetail(String detail) {
                    this.detail = detail;
                }

                public String getInfo() {
                    return info;
                }

                public void setInfo(String info) {
                    this.info = info;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }

        public static class ObserveDTO {
            /**
             * degree : -1
             * humidity : 24
             * precipitation : 0
             * pressure : 1030
             * update_time : 202101041040
             * weather : 多云
             * weather_code : 01
             * weather_short : 多云
             * wind_direction : 7
             * wind_power : 3
             */

            private String degree;
            private String humidity;
            private String precipitation;
            private String pressure;
            private String update_time;
            private String weather;
            private String weather_code;
            private String weather_short;
            private String wind_direction;
            private String wind_power;

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(String precipitation) {
                this.precipitation = precipitation;
            }

            public String getPressure() {
                return pressure;
            }

            public void setPressure(String pressure) {
                this.pressure = pressure;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeather_code() {
                return weather_code;
            }

            public void setWeather_code(String weather_code) {
                this.weather_code = weather_code;
            }

            public String getWeather_short() {
                return weather_short;
            }

            public void setWeather_short(String weather_short) {
                this.weather_short = weather_short;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_power() {
                return wind_power;
            }

            public void setWind_power(String wind_power) {
                this.wind_power = wind_power;
            }
        }

        public static class RiseDTO {
            /**
             * 0 : {"sunrise":"07:36","sunset":"17:02","time":"20210104"}
             * 1 : {"sunrise":"07:36","sunset":"17:03","time":"20210105"}
             * 10 : {"sunrise":"07:34","sunset":"17:12","time":"20210114"}
             * 11 : {"sunrise":"07:33","sunset":"17:13","time":"20210115"}
             * 12 : {"sunrise":"07:33","sunset":"17:14","time":"20210116"}
             * 13 : {"sunrise":"07:33","sunset":"17:15","time":"20210117"}
             * 14 : {"sunrise":"07:32","sunset":"17:17","time":"20210118"}
             * 15 : {"sunrise":"","sunset":"","time":"20210103"}
             * 2 : {"sunrise":"07:35","sunset":"17:04","time":"20210106"}
             * 3 : {"sunrise":"07:35","sunset":"17:05","time":"20210107"}
             * 4 : {"sunrise":"07:35","sunset":"17:06","time":"20210108"}
             * 5 : {"sunrise":"07:35","sunset":"17:07","time":"20210109"}
             * 6 : {"sunrise":"07:35","sunset":"17:08","time":"20210110"}
             * 7 : {"sunrise":"07:35","sunset":"17:09","time":"20210111"}
             * 8 : {"sunrise":"07:34","sunset":"17:10","time":"20210112"}
             * 9 : {"sunrise":"07:34","sunset":"17:11","time":"20210113"}
             */

            @SerializedName("0")
            private _$0DTO _$0;
            @SerializedName("1")
            private _$1DTO _$1;
            @SerializedName("10")
            private _$10DTO _$10;
            @SerializedName("11")
            private _$11DTO _$11;
            @SerializedName("12")
            private _$12DTO _$12;
            @SerializedName("13")
            private _$13DTO _$13;
            @SerializedName("14")
            private _$14DTO _$14;
            @SerializedName("15")
            private _$15DTO _$15;
            @SerializedName("2")
            private _$2DTO _$2;
            @SerializedName("3")
            private _$3DTO _$3;
            @SerializedName("4")
            private _$4DTO _$4;
            @SerializedName("5")
            private _$5DTO _$5;
            @SerializedName("6")
            private _$6DTO _$6;
            @SerializedName("7")
            private _$7DTO _$7;
            @SerializedName("8")
            private _$8DTO _$8;
            @SerializedName("9")
            private _$9DTO _$9;

            public _$0DTO get_$0() {
                return _$0;
            }

            public void set_$0(_$0DTO _$0) {
                this._$0 = _$0;
            }

            public _$1DTO get_$1() {
                return _$1;
            }

            public void set_$1(_$1DTO _$1) {
                this._$1 = _$1;
            }

            public _$10DTO get_$10() {
                return _$10;
            }

            public void set_$10(_$10DTO _$10) {
                this._$10 = _$10;
            }

            public _$11DTO get_$11() {
                return _$11;
            }

            public void set_$11(_$11DTO _$11) {
                this._$11 = _$11;
            }

            public _$12DTO get_$12() {
                return _$12;
            }

            public void set_$12(_$12DTO _$12) {
                this._$12 = _$12;
            }

            public _$13DTO get_$13() {
                return _$13;
            }

            public void set_$13(_$13DTO _$13) {
                this._$13 = _$13;
            }

            public _$14DTO get_$14() {
                return _$14;
            }

            public void set_$14(_$14DTO _$14) {
                this._$14 = _$14;
            }

            public _$15DTO get_$15() {
                return _$15;
            }

            public void set_$15(_$15DTO _$15) {
                this._$15 = _$15;
            }

            public _$2DTO get_$2() {
                return _$2;
            }

            public void set_$2(_$2DTO _$2) {
                this._$2 = _$2;
            }

            public _$3DTO get_$3() {
                return _$3;
            }

            public void set_$3(_$3DTO _$3) {
                this._$3 = _$3;
            }

            public _$4DTO get_$4() {
                return _$4;
            }

            public void set_$4(_$4DTO _$4) {
                this._$4 = _$4;
            }

            public _$5DTO get_$5() {
                return _$5;
            }

            public void set_$5(_$5DTO _$5) {
                this._$5 = _$5;
            }

            public _$6DTO get_$6() {
                return _$6;
            }

            public void set_$6(_$6DTO _$6) {
                this._$6 = _$6;
            }

            public _$7DTO get_$7() {
                return _$7;
            }

            public void set_$7(_$7DTO _$7) {
                this._$7 = _$7;
            }

            public _$8DTO get_$8() {
                return _$8;
            }

            public void set_$8(_$8DTO _$8) {
                this._$8 = _$8;
            }

            public _$9DTO get_$9() {
                return _$9;
            }

            public void set_$9(_$9DTO _$9) {
                this._$9 = _$9;
            }

            public static class _$0DTO {
                /**
                 * sunrise : 07:36
                 * sunset : 17:02
                 * time : 20210104
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$1DTO {
                /**
                 * sunrise : 07:36
                 * sunset : 17:03
                 * time : 20210105
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$10DTO {
                /**
                 * sunrise : 07:34
                 * sunset : 17:12
                 * time : 20210114
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$11DTO {
                /**
                 * sunrise : 07:33
                 * sunset : 17:13
                 * time : 20210115
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$12DTO {
                /**
                 * sunrise : 07:33
                 * sunset : 17:14
                 * time : 20210116
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$13DTO {
                /**
                 * sunrise : 07:33
                 * sunset : 17:15
                 * time : 20210117
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$14DTO {
                /**
                 * sunrise : 07:32
                 * sunset : 17:17
                 * time : 20210118
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$15DTO {
                /**
                 * sunrise :
                 * sunset :
                 * time : 20210103
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$2DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:04
                 * time : 20210106
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$3DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:05
                 * time : 20210107
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$4DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:06
                 * time : 20210108
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$5DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:07
                 * time : 20210109
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$6DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:08
                 * time : 20210110
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$7DTO {
                /**
                 * sunrise : 07:35
                 * sunset : 17:09
                 * time : 20210111
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$8DTO {
                /**
                 * sunrise : 07:34
                 * sunset : 17:10
                 * time : 20210112
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }

            public static class _$9DTO {
                /**
                 * sunrise : 07:34
                 * sunset : 17:11
                 * time : 20210113
                 */

                private String sunrise;
                private String sunset;
                private String time;

                public String getSunrise() {
                    return sunrise;
                }

                public void setSunrise(String sunrise) {
                    this.sunrise = sunrise;
                }

                public String getSunset() {
                    return sunset;
                }

                public void setSunset(String sunset) {
                    this.sunset = sunset;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }
            }
        }

        public static class TipsDTO {
            /**
             * observe : {"0":"光芒透过云缝，洒向大地~","1":"天冷了，多穿点衣服~"}
             */

            private ObserveDTO observe;

            public ObserveDTO getObserve() {
                return observe;
            }

            public void setObserve(ObserveDTO observe) {
                this.observe = observe;
            }

            public static class ObserveDTO {
                /**
                 * 0 : 光芒透过云缝，洒向大地~
                 * 1 : 天冷了，多穿点衣服~
                 */

                @SerializedName("0")
                private String _$0;
                @SerializedName("1")
                private String _$1;

                public String get_$0() {
                    return _$0;
                }

                public void set_$0(String _$0) {
                    this._$0 = _$0;
                }

                public String get_$1() {
                    return _$1;
                }

                public void set_$1(String _$1) {
                    this._$1 = _$1;
                }
            }
        }
    }
}