# 解决BeanUtils不能封装Date类型
            ConvertUtils.register(new Converter() {

                @Override
                public Object convert(Class clazz, Object value) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date parse = null ;
                    try {
                        if(value.equals("")||value==null) {
                            value="1970-01-01";
                        }
                        parse = format.parse(value.toString());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    return parse;
                }
                
            }, Date.class);
            BeanUtils.populate(user, properties);