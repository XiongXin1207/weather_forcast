package com.example.weather_forcast.bean;

import com.google.gson.annotations.SerializedName;

public class WeatherBean {

    /**
     * data : {"air":{"aqi":51,"aqi_level":2,"aqi_name":"良","co":"0.6","no2":"36","o3":"22","pm10":"52","pm2.5":"20","so2":"4","update_time":"20210104090000"},"alarm":{},"forecast_24h":{"0":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-1","min_degree":"-8","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-03"},"1":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-1","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-04"},"2":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-2","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西北风","night_wind_direction_code":"7","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-05"},"3":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"5","day_wind_power_code":"2","max_degree":"-8","min_degree":"-15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-06"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-7","min_degree":"-13","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-07"},"5":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-3","min_degree":"-12","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-08"},"6":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"0","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-09"},"7":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"1","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西风","night_wind_direction_code":"6","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-10"}},"index":{"airconditioner":{"detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜","name":"洗车"},"chill":{"detail":"感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷","name":"风寒"},"clothes":{"detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷","name":"穿衣"},"cold":{"detail":"天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发","name":"感冒"},"comfort":{"detail":"白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。","info":"较差","name":"心情"},"morning":{"detail":"风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。","info":"较不宜","name":"晨练"},"sports":{"detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天根据户外光线情况，适时佩戴太阳镜","info":"需要","name":"太阳镜"},"sunscreen":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱","name":"防晒"},"time":"20210104","tourism":{"detail":"天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。","info":"一般","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱","name":"紫外线强度"},"umbrella":{"detail":"天气较好，不会降水，因此您可放心出门，无须带雨伞。","info":"不带伞","name":"雨伞"}},"observe":{"degree":"-3","humidity":"34","precipitation":"0","pressure":"1029","update_time":"202101040940","weather":"多云","weather_code":"01","weather_short":"多云","wind_direction":"1","wind_power":"2"},"rise":{"0":{"sunrise":"07:36","sunset":"17:02","time":"20210104"},"1":{"sunrise":"07:36","sunset":"17:03","time":"20210105"},"10":{"sunrise":"07:34","sunset":"17:12","time":"20210114"},"11":{"sunrise":"07:33","sunset":"17:13","time":"20210115"},"12":{"sunrise":"07:33","sunset":"17:14","time":"20210116"},"13":{"sunrise":"07:33","sunset":"17:15","time":"20210117"},"14":{"sunrise":"07:32","sunset":"17:17","time":"20210118"},"15":{"sunrise":"","sunset":"","time":"20210103"},"2":{"sunrise":"07:35","sunset":"17:04","time":"20210106"},"3":{"sunrise":"07:35","sunset":"17:05","time":"20210107"},"4":{"sunrise":"07:35","sunset":"17:06","time":"20210108"},"5":{"sunrise":"07:35","sunset":"17:07","time":"20210109"},"6":{"sunrise":"07:35","sunset":"17:08","time":"20210110"},"7":{"sunrise":"07:35","sunset":"17:09","time":"20210111"},"8":{"sunrise":"07:34","sunset":"17:10","time":"20210112"},"9":{"sunrise":"07:34","sunset":"17:11","time":"20210113"}},"tips":{"observe":{"0":"光芒透过云缝，洒向大地~","1":"天冷了，多穿点衣服~"}}}
     * message : OK
     * status : 200
     */

    @SerializedName("data")
    private DataDTO data;
    @SerializedName("message")
    private String message;
    @SerializedName("status")
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
         * air : {"aqi":51,"aqi_level":2,"aqi_name":"良","co":"0.6","no2":"36","o3":"22","pm10":"52","pm2.5":"20","so2":"4","update_time":"20210104090000"}
         * alarm : {}
         * forecast_24h : {"0":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-1","min_degree":"-8","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-03"},"1":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-1","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-04"},"2":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西南风","day_wind_direction_code":"5","day_wind_power":"3","day_wind_power_code":"0","max_degree":"-2","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西北风","night_wind_direction_code":"7","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-05"},"3":{"day_weather":"多云","day_weather_code":"01","day_weather_short":"多云","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"5","day_wind_power_code":"2","max_degree":"-8","min_degree":"-15","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"4","night_wind_power_code":"1","time":"2021-01-06"},"4":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-7","min_degree":"-13","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-07"},"5":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"-3","min_degree":"-12","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-08"},"6":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"4","day_wind_power_code":"1","max_degree":"0","min_degree":"-11","night_weather":"晴","night_weather_code":"00","night_weather_short":"晴","night_wind_direction":"北风","night_wind_direction_code":"8","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-09"},"7":{"day_weather":"晴","day_weather_code":"00","day_weather_short":"晴","day_wind_direction":"西北风","day_wind_direction_code":"7","day_wind_power":"3","day_wind_power_code":"0","max_degree":"1","min_degree":"-11","night_weather":"多云","night_weather_code":"01","night_weather_short":"多云","night_wind_direction":"西风","night_wind_direction_code":"6","night_wind_power":"3","night_wind_power_code":"0","time":"2021-01-10"}}
         * index : {"airconditioner":{"detail":"您将感到有些冷，可以适当开启制暖空调调节室内温度，以免着凉感冒。","info":"开启制暖空调","name":"空调开启"},"allergy":{"detail":"天气条件极不易诱发过敏。","info":"极不易发","name":"过敏"},"carwash":{"detail":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","info":"较不宜","name":"洗车"},"chill":{"detail":"感觉寒冷，室外活动要注意保暖，可戴手套与帽子。","info":"寒冷","name":"风寒"},"clothes":{"detail":"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。","info":"寒冷","name":"穿衣"},"cold":{"detail":"天冷，发生感冒机率较大，请注意适当增加衣服，加强自我防护避免感冒。","info":"易发","name":"感冒"},"comfort":{"detail":"白天天气虽然晴好，但天气凉，您会感觉很冷，不舒适，请注意保暖防寒。","info":"很不舒适","name":"舒适度"},"diffusion":{"detail":"气象条件有利于空气污染物稀释、扩散和清除。","info":"良","name":"空气污染扩散条件"},"dry":{"detail":"天气较好，路面比较干燥，路况较好。","info":"干燥","name":"路况"},"drying":{"detail":"天气不错，午后温暖的阳光仍能满足你驱潮消霉杀菌的晾晒需求。","info":"基本适宜","name":"晾晒"},"fish":{"detail":"较适合垂钓，但风力稍大，会对垂钓产生一定的影响。","info":"较适宜","name":"钓鱼"},"heatstroke":{"detail":"天气舒适，对易中暑人群来说非常友善。","info":"无中暑风险","name":"中暑"},"makeup":{"detail":"天气寒冷，请用滋润保湿型化妆品，少扑粉，使用润唇膏后再抹口红。","info":"保湿","name":"化妆"},"mood":{"detail":"天气较好，气温较低，会让人觉得有些压抑，不妨与朋友同事沟通交流下，舒缓下心情。","info":"较差","name":"心情"},"morning":{"detail":"风力稍大，较不宜晨练，室外锻炼请注意选择避风的地点，避免迎风锻炼。","info":"较不宜","name":"晨练"},"sports":{"detail":"天气较好，但考虑天气寒冷，风力较强，推荐您进行室内运动，若户外运动请注意保暖并做好准备活动。","info":"较不宜","name":"运动"},"sunglasses":{"detail":"白天根据户外光线情况，适时佩戴太阳镜","info":"需要","name":"太阳镜"},"sunscreen":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间，PA+的防晒护肤品。","info":"较弱","name":"防晒"},"time":"20210104","tourism":{"detail":"天空状况还是比较好的，但温度比较低，且风稍大，会让人感觉有点冷。外出请备上防风保暖衣物。","info":"一般","name":"旅游"},"traffic":{"detail":"天气较好，路面干燥，交通气象条件良好，车辆可以正常行驶。","info":"良好","name":"交通"},"ultraviolet":{"detail":"紫外线强度较弱，建议涂擦SPF在12-15之间、PA+的防晒护肤品。","info":"弱","name":"紫外线强度"},"umbrella":{"detail":"天气较好，不会降水，因此您可放心出门，无须带雨伞。","info":"不带伞","name":"雨伞"}}
         * observe : {"degree":"-3","humidity":"34","precipitation":"0","pressure":"1029","update_time":"202101040940","weather":"多云","weather_code":"01","weather_short":"多云","wind_direction":"1","wind_power":"2"}
         * rise : {"0":{"sunrise":"07:36","sunset":"17:02","time":"20210104"},"1":{"sunrise":"07:36","sunset":"17:03","time":"20210105"},"10":{"sunrise":"07:34","sunset":"17:12","time":"20210114"},"11":{"sunrise":"07:33","sunset":"17:13","time":"20210115"},"12":{"sunrise":"07:33","sunset":"17:14","time":"20210116"},"13":{"sunrise":"07:33","sunset":"17:15","time":"20210117"},"14":{"sunrise":"07:32","sunset":"17:17","time":"20210118"},"15":{"sunrise":"","sunset":"","time":"20210103"},"2":{"sunrise":"07:35","sunset":"17:04","time":"20210106"},"3":{"sunrise":"07:35","sunset":"17:05","time":"20210107"},"4":{"sunrise":"07:35","sunset":"17:06","time":"20210108"},"5":{"sunrise":"07:35","sunset":"17:07","time":"20210109"},"6":{"sunrise":"07:35","sunset":"17:08","time":"20210110"},"7":{"sunrise":"07:35","sunset":"17:09","time":"20210111"},"8":{"sunrise":"07:34","sunset":"17:10","time":"20210112"},"9":{"sunrise":"07:34","sunset":"17:11","time":"20210113"}}
         * tips : {"observe":{"0":"光芒透过云缝，洒向大地~","1":"天冷了，多穿点衣服~"}}
         */

        @SerializedName("air")
        private AirDTO air;
        @SerializedName("alarm")
        private AlarmDTO alarm;
        @SerializedName("forecast_24h")
        private Forecast24hDTO forecast24h;
        @SerializedName("index")
        private IndexDTO index;
        @SerializedName("observe")
        private ObserveDTO observe;
        @SerializedName("rise")
        private RiseDTO rise;
        @SerializedName("tips")
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

        public Forecast24hDTO getForecast24h() {
            return forecast24h;
        }

        public void setForecast24h(Forecast24hDTO forecast24h) {
            this.forecast24h = forecast24h;
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
            private _$0DTO $0;
            @SerializedName("1")
            private _$1DTO $1;
            @SerializedName("2")
            private _$2DTO $2;
            @SerializedName("3")
            private _$3DTO $3;
            @SerializedName("4")
            private _$4DTO $4;
            @SerializedName("5")
            private _$5DTO $5;
            @SerializedName("6")
            private _$6DTO $6;
            @SerializedName("7")
            private _$7DTO $7;

            public _$0DTO get$0() {
                return $0;
            }

            public void set$0(_$0DTO $0) {
                this.$0 = $0;
            }

            public _$1DTO get$1() {
                return $1;
            }

            public void set$1(_$1DTO $1) {
                this.$1 = $1;
            }

            public _$2DTO get$2() {
                return $2;
            }

            public void set$2(_$2DTO $2) {
                this.$2 = $2;
            }

            public _$3DTO get$3() {
                return $3;
            }

            public void set$3(_$3DTO $3) {
                this.$3 = $3;
            }

            public _$4DTO get$4() {
                return $4;
            }

            public void set$4(_$4DTO $4) {
                this.$4 = $4;
            }

            public _$5DTO get$5() {
                return $5;
            }

            public void set$5(_$5DTO $5) {
                this.$5 = $5;
            }

            public _$6DTO get$6() {
                return $6;
            }

            public void set$6(_$6DTO $6) {
                this.$6 = $6;
            }

            public _$7DTO get$7() {
                return $7;
            }

            public void set$7(_$7DTO $7) {
                this.$7 = $7;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

                @SerializedName("day_weather")
                private String dayWeather;
                @SerializedName("day_weather_code")
                private String dayWeatherCode;
                @SerializedName("day_weather_short")
                private String dayWeatherShort;
                @SerializedName("day_wind_direction")
                private String dayWindDirection;
                @SerializedName("day_wind_direction_code")
                private String dayWindDirectionCode;
                @SerializedName("day_wind_power")
                private String dayWindPower;
                @SerializedName("day_wind_power_code")
                private String dayWindPowerCode;
                @SerializedName("max_degree")
                private String maxDegree;
                @SerializedName("min_degree")
                private String minDegree;
                @SerializedName("night_weather")
                private String nightWeather;
                @SerializedName("night_weather_code")
                private String nightWeatherCode;
                @SerializedName("night_weather_short")
                private String nightWeatherShort;
                @SerializedName("night_wind_direction")
                private String nightWindDirection;
                @SerializedName("night_wind_direction_code")
                private String nightWindDirectionCode;
                @SerializedName("night_wind_power")
                private String nightWindPower;
                @SerializedName("night_wind_power_code")
                private String nightWindPowerCode;
                @SerializedName("time")
                private String time;

                public String getDayWeather() {
                    return dayWeather;
                }

                public void setDayWeather(String dayWeather) {
                    this.dayWeather = dayWeather;
                }

                public String getDayWeatherCode() {
                    return dayWeatherCode;
                }

                public void setDayWeatherCode(String dayWeatherCode) {
                    this.dayWeatherCode = dayWeatherCode;
                }

                public String getDayWeatherShort() {
                    return dayWeatherShort;
                }

                public void setDayWeatherShort(String dayWeatherShort) {
                    this.dayWeatherShort = dayWeatherShort;
                }

                public String getDayWindDirection() {
                    return dayWindDirection;
                }

                public void setDayWindDirection(String dayWindDirection) {
                    this.dayWindDirection = dayWindDirection;
                }

                public String getDayWindDirectionCode() {
                    return dayWindDirectionCode;
                }

                public void setDayWindDirectionCode(String dayWindDirectionCode) {
                    this.dayWindDirectionCode = dayWindDirectionCode;
                }

                public String getDayWindPower() {
                    return dayWindPower;
                }

                public void setDayWindPower(String dayWindPower) {
                    this.dayWindPower = dayWindPower;
                }

                public String getDayWindPowerCode() {
                    return dayWindPowerCode;
                }

                public void setDayWindPowerCode(String dayWindPowerCode) {
                    this.dayWindPowerCode = dayWindPowerCode;
                }

                public String getMaxDegree() {
                    return maxDegree;
                }

                public void setMaxDegree(String maxDegree) {
                    this.maxDegree = maxDegree;
                }

                public String getMinDegree() {
                    return minDegree;
                }

                public void setMinDegree(String minDegree) {
                    this.minDegree = minDegree;
                }

                public String getNightWeather() {
                    return nightWeather;
                }

                public void setNightWeather(String nightWeather) {
                    this.nightWeather = nightWeather;
                }

                public String getNightWeatherCode() {
                    return nightWeatherCode;
                }

                public void setNightWeatherCode(String nightWeatherCode) {
                    this.nightWeatherCode = nightWeatherCode;
                }

                public String getNightWeatherShort() {
                    return nightWeatherShort;
                }

                public void setNightWeatherShort(String nightWeatherShort) {
                    this.nightWeatherShort = nightWeatherShort;
                }

                public String getNightWindDirection() {
                    return nightWindDirection;
                }

                public void setNightWindDirection(String nightWindDirection) {
                    this.nightWindDirection = nightWindDirection;
                }

                public String getNightWindDirectionCode() {
                    return nightWindDirectionCode;
                }

                public void setNightWindDirectionCode(String nightWindDirectionCode) {
                    this.nightWindDirectionCode = nightWindDirectionCode;
                }

                public String getNightWindPower() {
                    return nightWindPower;
                }

                public void setNightWindPower(String nightWindPower) {
                    this.nightWindPower = nightWindPower;
                }

                public String getNightWindPowerCode() {
                    return nightWindPowerCode;
                }

                public void setNightWindPowerCode(String nightWindPowerCode) {
                    this.nightWindPowerCode = nightWindPowerCode;
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

            @SerializedName("airconditioner")
            private AirconditionerDTO airconditioner;
            @SerializedName("allergy")
            private AllergyDTO allergy;
            @SerializedName("carwash")
            private CarwashDTO carwash;
            @SerializedName("chill")
            private ChillDTO chill;
            @SerializedName("clothes")
            private ClothesDTO clothes;
            @SerializedName("cold")
            private ColdDTO cold;
            @SerializedName("comfort")
            private ComfortDTO comfort;
            @SerializedName("diffusion")
            private DiffusionDTO diffusion;
            @SerializedName("dry")
            private DryDTO dry;
            @SerializedName("drying")
            private DryingDTO drying;
            @SerializedName("fish")
            private FishDTO fish;
            @SerializedName("heatstroke")
            private HeatstrokeDTO heatstroke;
            @SerializedName("makeup")
            private MakeupDTO makeup;
            @SerializedName("mood")
            private MoodDTO mood;
            @SerializedName("morning")
            private MorningDTO morning;
            @SerializedName("sports")
            private SportsDTO sports;
            @SerializedName("sunglasses")
            private SunglassesDTO sunglasses;
            @SerializedName("sunscreen")
            private SunscreenDTO sunscreen;
            @SerializedName("time")
            private String time;
            @SerializedName("tourism")
            private TourismDTO tourism;
            @SerializedName("traffic")
            private TrafficDTO traffic;
            @SerializedName("ultraviolet")
            private UltravioletDTO ultraviolet;
            @SerializedName("umbrella")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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

                @SerializedName("detail")
                private String detail;
                @SerializedName("info")
                private String info;
                @SerializedName("name")
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
             * degree : -3
             * humidity : 34
             * precipitation : 0
             * pressure : 1029
             * update_time : 202101040940
             * weather : 多云
             * weather_code : 01
             * weather_short : 多云
             * wind_direction : 1
             * wind_power : 2
             */

            @SerializedName("degree")
            private String degree;
            @SerializedName("humidity")
            private String humidity;
            @SerializedName("precipitation")
            private String precipitation;
            @SerializedName("pressure")
            private String pressure;
            @SerializedName("update_time")
            private String updateTime;
            @SerializedName("weather")
            private String weather;
            @SerializedName("weather_code")
            private String weatherCode;
            @SerializedName("weather_short")
            private String weatherShort;
            @SerializedName("wind_direction")
            private String windDirection;
            @SerializedName("wind_power")
            private String windPower;

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

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public String getWeatherCode() {
                return weatherCode;
            }

            public void setWeatherCode(String weatherCode) {
                this.weatherCode = weatherCode;
            }

            public String getWeatherShort() {
                return weatherShort;
            }

            public void setWeatherShort(String weatherShort) {
                this.weatherShort = weatherShort;
            }

            public String getWindDirection() {
                return windDirection;
            }

            public void setWindDirection(String windDirection) {
                this.windDirection = windDirection;
            }

            public String getWindPower() {
                return windPower;
            }

            public void setWindPower(String windPower) {
                this.windPower = windPower;
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
            private _$0DTOX $0;
            @SerializedName("1")
            private _$1DTOX $1;
            @SerializedName("10")
            private _$10DTO $10;
            @SerializedName("11")
            private _$11DTO $11;
            @SerializedName("12")
            private _$12DTO $12;
            @SerializedName("13")
            private _$13DTO $13;
            @SerializedName("14")
            private _$14DTO $14;
            @SerializedName("15")
            private _$15DTO $15;
            @SerializedName("2")
            private _$2DTOX $2;
            @SerializedName("3")
            private _$3DTOX $3;
            @SerializedName("4")
            private _$4DTOX $4;
            @SerializedName("5")
            private _$5DTOX $5;
            @SerializedName("6")
            private _$6DTOX $6;
            @SerializedName("7")
            private _$7DTOX $7;
            @SerializedName("8")
            private _$8DTO $8;
            @SerializedName("9")
            private _$9DTO $9;

            public _$0DTOX get$0() {
                return $0;
            }

            public void set$0(_$0DTOX $0) {
                this.$0 = $0;
            }

            public _$1DTOX get$1() {
                return $1;
            }

            public void set$1(_$1DTOX $1) {
                this.$1 = $1;
            }

            public _$10DTO get$10() {
                return $10;
            }

            public void set$10(_$10DTO $10) {
                this.$10 = $10;
            }

            public _$11DTO get$11() {
                return $11;
            }

            public void set$11(_$11DTO $11) {
                this.$11 = $11;
            }

            public _$12DTO get$12() {
                return $12;
            }

            public void set$12(_$12DTO $12) {
                this.$12 = $12;
            }

            public _$13DTO get$13() {
                return $13;
            }

            public void set$13(_$13DTO $13) {
                this.$13 = $13;
            }

            public _$14DTO get$14() {
                return $14;
            }

            public void set$14(_$14DTO $14) {
                this.$14 = $14;
            }

            public _$15DTO get$15() {
                return $15;
            }

            public void set$15(_$15DTO $15) {
                this.$15 = $15;
            }

            public _$2DTOX get$2() {
                return $2;
            }

            public void set$2(_$2DTOX $2) {
                this.$2 = $2;
            }

            public _$3DTOX get$3() {
                return $3;
            }

            public void set$3(_$3DTOX $3) {
                this.$3 = $3;
            }

            public _$4DTOX get$4() {
                return $4;
            }

            public void set$4(_$4DTOX $4) {
                this.$4 = $4;
            }

            public _$5DTOX get$5() {
                return $5;
            }

            public void set$5(_$5DTOX $5) {
                this.$5 = $5;
            }

            public _$6DTOX get$6() {
                return $6;
            }

            public void set$6(_$6DTOX $6) {
                this.$6 = $6;
            }

            public _$7DTOX get$7() {
                return $7;
            }

            public void set$7(_$7DTOX $7) {
                this.$7 = $7;
            }

            public _$8DTO get$8() {
                return $8;
            }

            public void set$8(_$8DTO $8) {
                this.$8 = $8;
            }

            public _$9DTO get$9() {
                return $9;
            }

            public void set$9(_$9DTO $9) {
                this.$9 = $9;
            }

            public static class _$0DTOX {
                /**
                 * sunrise : 07:36
                 * sunset : 17:02
                 * time : 20210104
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$1DTOX {
                /**
                 * sunrise : 07:36
                 * sunset : 17:03
                 * time : 20210105
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$2DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:04
                 * time : 20210106
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$3DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:05
                 * time : 20210107
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$4DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:06
                 * time : 20210108
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$5DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:07
                 * time : 20210109
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$6DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:08
                 * time : 20210110
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            public static class _$7DTOX {
                /**
                 * sunrise : 07:35
                 * sunset : 17:09
                 * time : 20210111
                 */

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

                @SerializedName("sunrise")
                private String sunrise;
                @SerializedName("sunset")
                private String sunset;
                @SerializedName("time")
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

            @SerializedName("observe")
            private ObserveDTOX observe;

            public ObserveDTOX getObserve() {
                return observe;
            }

            public void setObserve(ObserveDTOX observe) {
                this.observe = observe;
            }

            public static class ObserveDTOX {
                /**
                 * 0 : 光芒透过云缝，洒向大地~
                 * 1 : 天冷了，多穿点衣服~
                 */

                @SerializedName("0")
                private String $0;
                @SerializedName("1")
                private String $1;

                public String get$0() {
                    return $0;
                }

                public void set$0(String $0) {
                    this.$0 = $0;
                }

                public String get$1() {
                    return $1;
                }

                public void set$1(String $1) {
                    this.$1 = $1;
                }
            }
        }
    }
}