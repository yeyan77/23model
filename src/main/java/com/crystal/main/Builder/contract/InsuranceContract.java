package com.crystal.main.Builder.contract;

/**
 * 保险合同类
 * Created by hp on 2017-06-01.
 */
public class InsuranceContract {
    //保险合同编号
    private String contractId;

    /**
     * 被保险人员的名称，同一份保险合同，要么跟人员签订，要么跟公司签订
     * 也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
     */
    private String personName;
    //被保险公司的名称
    private String companyName;
    //保险开始生效日期
    private long beginDate;
    //保险失效日期，一定会大于保险开始生效日期
    private long endDate;

    //其他数据
    private String otherData;

    private InsuranceContract(ConcreateBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }


    public void someOperation(){
        System.out.println("当前正在操作的保险合同编号为【"+this.contractId+"】");
    }


    public static class ConcreateBuilder{
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public ConcreateBuilder(String contractId,long beginDate,long endDate){
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreateBuilder setPersonName(String personName){
            this.personName = personName;
            return this;
        }

        public ConcreateBuilder setCompanyName(String companyName){
            this.companyName = companyName;
            return this;
        }

        public ConcreateBuilder setOtherData(String otherData){
            this.otherData = otherData;
            return this;
        }

        public InsuranceContract build(){

            if(contractId == null || contractId.length() == 0){
                throw new IllegalArgumentException("合同编号不可为空");
            }

            boolean signPerson = (personName !=null && personName.trim().length() > 0);
            boolean signCompany = (companyName != null && companyName.trim().length() > 0);

            if(signPerson && signCompany){
                throw  new IllegalArgumentException("一份合同不能同时签约个人与单位");
            }

            if(signPerson == false && signCompany == false){
                throw new IllegalArgumentException("一份合同不能没有签约对象");
            }

            if(beginDate <= 0 ){
                throw new IllegalArgumentException("一份保险合同必须有开始生效的日期");
            }
            if(endDate <=0){
                throw new IllegalArgumentException("一份保险合同必须有失效的日期");
            }
            if(endDate < beginDate){
                throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
            }

            return new InsuranceContract(this);
        }
    }

}
