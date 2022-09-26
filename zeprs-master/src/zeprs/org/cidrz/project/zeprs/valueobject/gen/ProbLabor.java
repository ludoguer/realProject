package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean ProbLabor generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-10-27
 *         Time: 17:44:30
 *         Form Name: Problem or Labor Visit
 *         Form Id: 65
 */

/**
 * @hibernate.joined-subclass table="problabor"
 * @hibernate.joined-subclass-key column="id"
 */
public class ProbLabor extends EncounterData {

private Byte field1250;	//contractions_1250
private Date field1251;	//contractions_date_1251
private Byte field1308;	//lower_abdominal_pains
private Date field1311;	//lower_abdominal_pains_date_onset
private Byte field1256;	//decreased_fetal_movement_1256
private Date field1257;	//deacreased_fetal_mvmt_date_onset
private Byte field1254;	//vag_bleeding_1254
private Date field1255;	//bleeding_date_of_onset_1255
private Byte field1252;	//vag_discharge_1252
private Date field1253;	//vag_discharge_date_of_onset_1253
private Byte field1309;	//fever
private Date field1312;	//fever_date_onset
private Byte field1258;	//elevated_blood_pressure
private Byte field1313;	//swelling_edema
private Byte field1314;	//trauma
private Byte field1310;	//nausea_vomiting
private Byte field1315;	//diarrhea
private Date field1316;	//diarrhea_date_onset
private Byte field1317;	//possible_reputure_membranes
private Byte field1318;	//shortness_of_breath
private Byte field1259;	//possible_infection
private Byte field1358;	//backache
private Byte field1489;	//headache
private Date field1490;	//date_onset_headache
private Byte field1494;	//fatigue_dizziness
private Byte field1493;	//lack_of_foetal_movement
private Byte field1495;	//cough
private Byte field1260;	//other_reasons
private String field1496;	//reasons_other_describe
private String field1759;	//comments_reasons_for_eval
private Integer field167;	//respiratory_system_167
private String field1449;	//respiratory_system_other
private Integer field269;	//respiration_rate_269
private Integer field224;	//bp_systolic_224
private Integer field225;	//bp_diastolic_225
private Integer field171;	//pulse_171
private Float field266;	//temperature_266
private Integer field159;	//height_159
private Float field228;	//weight_228
private Integer field161;	//heent_161
private String field162;	//heent_abnorm_162
private Integer field165;	//thyroid_165
private Integer field166;	//breasts_166
private Integer field169;	//heart_169
private String field170;	//heart_other_170
private Integer field172;	//abdomen_172
private String field173;	//abdomen_abnormal_173
private Integer field176;	//skin_176
private String field177;	//skin_abnorm_177
private Integer field174;	//extremities_174
private String field175;	//extremities_abnormal_175
private Integer field178;	//lymph_nodes_178
private Integer field179;	//rectum_179
private String field180;	//rectum_abnormal_180
private Integer field181;	//vulva_181
private String field182;	//vulva_abnormal_182
private Integer field183;	//vagina_183
private String field184;	//vagina_abnormal_184
private Integer field185;	//cervix_185
private String field186;	//cervix_abnormal_186
private Integer field187;	//uterus_187
private Integer field188;	//uterus_size_in_days_188
private Integer field189;	//adnexa_189
private String field190;	//adnexa_abnormal_190
private Integer field191;	//varicosities_191
private Integer field163;	//teeth_163
private String field164;	//teeth_other_164
private Integer field1356;	//cns_192
private Time field1175;	//time_of_exam_1175
private Integer field232;	//fundal_height_232
private Integer field313;	//lie_313
private Integer field314;	//presentation_314
private String field1508;	//presentation_other
private Integer field315;	//descent_315
private Integer field316;	//contraction_strength_316
private Integer field317;	//contraction_freq_10_abd_palp_317
private Integer field318;	//foetal_heart_rate_abd_palp_318
private Time field320;	//time_320
private Date field328;	//rupture_of_membranes_date_328
private Time field329;	//rupture_of_membranes_time_329
private Integer field335;	//presentation_obtained_by_335
private Integer field321;	//condition_of_vulva_321
private String field322;	//condition_of_vulva_desc_322
private Integer field323;	//condition_of_vagina_323
private String field324;	//condition_of_vagina_other_324
private Integer field325;	//cervix_dilatation325
private Integer field326;	//cervix_effacement_326
private Integer field327;	//cervix_consistency_327
private Integer field330;	//membranes_re_330
private Integer field331;	//liquor_331
private Integer field336;	//station_of_pp_336
private transient String field337;	//position_337
private Integer field338;	//moulding_338
private Integer field339;	//caput_339
private Integer field340;	//cord_at_vaginal_exam_340
private Byte field1221;	//rupture_of_membranes_1221
private Integer field342;	//diagonal_conjugate_342
private Integer field343;	//diagonal_conjugate_length_343
private Integer field344;	//ishcial_spines_344
private Integer field345;	//sub_pubic_arch_345
private Integer field346;	//curvature_of_sacrum_346
private Integer field347;	//intertuberous_diameter_347
private Integer field348;	//adequacy_of_pelvic_348
private Integer field349;	//pubic_arch_angle_349
private Boolean field1261;	//false_labour
private Boolean field1262;	//true_labor
private Boolean field1263;	//rupture_of_membranes
private Boolean field1265;	//preeclamp_hypert_1265
private Boolean field1360;	//premature_labour
private Boolean field1497;	//malaria_diag
private Boolean field1270;	//anaemia
private Boolean field1499;	//high_bp_diag
private Boolean field1500;	//vaginal_bleeding_diag
private Boolean field1501;	//intrauterine_death
private Boolean field1502;	//uti_diag
private Boolean field1503;	//pneumonia_diag
private Boolean field1504;	//tb_diag
private Boolean field1505;	//vaginal_thrush_diag
private Boolean field1506;	//oral_thrush_diag
private Byte field1756;	//eclampsia
private Boolean field1757;	//abruptia_placenta
private Integer field1758;	//miscarriage
private Boolean field1932;	//latent_labour
private Boolean field1933;	//cns_normal
private Byte field2139;	//ante_maternal_death
private String field1359;	//diag_other
private Integer field1487;	//phase
private Integer field1266;	//disposition_labor
private Integer field1507;	//disp_ante
private Integer field1755;	//type_of_labour
private Integer field1841;	//uth_ward
private Integer field1349;	//priority_of_referral
private Integer field1620;	//transport
private String field1463;	//treatment_1463
private String field1464;	//comments_ante_prob_1464


 /**
  * @return
  * @hibernate.property column="contractions_1250"
  */
    public Byte getField1250() {
        return this.field1250;
    }

    public void setField1250(Byte field1250) {
        this.field1250 = field1250;
    }





 /**
  * @return
  * @hibernate.property column="contractions_date_1251"
  */
    public Date getField1251() {
        return this.field1251;
    }

    public void setField1251(Date field1251) {
        this.field1251 = field1251;
    }





 /**
  * @return
  * @hibernate.property column="lower_abdominal_pains"
  */
    public Byte getField1308() {
        return this.field1308;
    }

    public void setField1308(Byte field1308) {
        this.field1308 = field1308;
    }





 /**
  * @return
  * @hibernate.property column="lower_abdominal_pains_date_onset"
  */
    public Date getField1311() {
        return this.field1311;
    }

    public void setField1311(Date field1311) {
        this.field1311 = field1311;
    }





 /**
  * @return
  * @hibernate.property column="decreased_fetal_movement_1256"
  */
    public Byte getField1256() {
        return this.field1256;
    }

    public void setField1256(Byte field1256) {
        this.field1256 = field1256;
    }





 /**
  * @return
  * @hibernate.property column="deacreased_fetal_mvmt_date_onset"
  */
    public Date getField1257() {
        return this.field1257;
    }

    public void setField1257(Date field1257) {
        this.field1257 = field1257;
    }





 /**
  * @return
  * @hibernate.property column="vag_bleeding_1254"
  */
    public Byte getField1254() {
        return this.field1254;
    }

    public void setField1254(Byte field1254) {
        this.field1254 = field1254;
    }





 /**
  * @return
  * @hibernate.property column="bleeding_date_of_onset_1255"
  */
    public Date getField1255() {
        return this.field1255;
    }

    public void setField1255(Date field1255) {
        this.field1255 = field1255;
    }





 /**
  * @return
  * @hibernate.property column="vag_discharge_1252"
  */
    public Byte getField1252() {
        return this.field1252;
    }

    public void setField1252(Byte field1252) {
        this.field1252 = field1252;
    }





 /**
  * @return
  * @hibernate.property column="vag_discharge_date_of_onset_1253"
  */
    public Date getField1253() {
        return this.field1253;
    }

    public void setField1253(Date field1253) {
        this.field1253 = field1253;
    }





 /**
  * @return
  * @hibernate.property column="fever"
  */
    public Byte getField1309() {
        return this.field1309;
    }

    public void setField1309(Byte field1309) {
        this.field1309 = field1309;
    }





 /**
  * @return
  * @hibernate.property column="fever_date_onset"
  */
    public Date getField1312() {
        return this.field1312;
    }

    public void setField1312(Date field1312) {
        this.field1312 = field1312;
    }





 /**
  * @return
  * @hibernate.property column="elevated_blood_pressure"
  */
    public Byte getField1258() {
        return this.field1258;
    }

    public void setField1258(Byte field1258) {
        this.field1258 = field1258;
    }





 /**
  * @return
  * @hibernate.property column="swelling_edema"
  */
    public Byte getField1313() {
        return this.field1313;
    }

    public void setField1313(Byte field1313) {
        this.field1313 = field1313;
    }





 /**
  * @return
  * @hibernate.property column="trauma"
  */
    public Byte getField1314() {
        return this.field1314;
    }

    public void setField1314(Byte field1314) {
        this.field1314 = field1314;
    }





 /**
  * @return
  * @hibernate.property column="nausea_vomiting"
  */
    public Byte getField1310() {
        return this.field1310;
    }

    public void setField1310(Byte field1310) {
        this.field1310 = field1310;
    }





 /**
  * @return
  * @hibernate.property column="diarrhea"
  */
    public Byte getField1315() {
        return this.field1315;
    }

    public void setField1315(Byte field1315) {
        this.field1315 = field1315;
    }





 /**
  * @return
  * @hibernate.property column="diarrhea_date_onset"
  */
    public Date getField1316() {
        return this.field1316;
    }

    public void setField1316(Date field1316) {
        this.field1316 = field1316;
    }





 /**
  * @return
  * @hibernate.property column="possible_reputure_membranes"
  */
    public Byte getField1317() {
        return this.field1317;
    }

    public void setField1317(Byte field1317) {
        this.field1317 = field1317;
    }





 /**
  * @return
  * @hibernate.property column="shortness_of_breath"
  */
    public Byte getField1318() {
        return this.field1318;
    }

    public void setField1318(Byte field1318) {
        this.field1318 = field1318;
    }





 /**
  * @return
  * @hibernate.property column="possible_infection"
  */
    public Byte getField1259() {
        return this.field1259;
    }

    public void setField1259(Byte field1259) {
        this.field1259 = field1259;
    }





 /**
  * @return
  * @hibernate.property column="backache"
  */
    public Byte getField1358() {
        return this.field1358;
    }

    public void setField1358(Byte field1358) {
        this.field1358 = field1358;
    }





 /**
  * @return
  * @hibernate.property column="headache"
  */
    public Byte getField1489() {
        return this.field1489;
    }

    public void setField1489(Byte field1489) {
        this.field1489 = field1489;
    }





 /**
  * @return
  * @hibernate.property column="date_onset_headache"
  */
    public Date getField1490() {
        return this.field1490;
    }

    public void setField1490(Date field1490) {
        this.field1490 = field1490;
    }





 /**
  * @return
  * @hibernate.property column="fatigue_dizziness"
  */
    public Byte getField1494() {
        return this.field1494;
    }

    public void setField1494(Byte field1494) {
        this.field1494 = field1494;
    }





 /**
  * @return
  * @hibernate.property column="lack_of_foetal_movement"
  */
    public Byte getField1493() {
        return this.field1493;
    }

    public void setField1493(Byte field1493) {
        this.field1493 = field1493;
    }





 /**
  * @return
  * @hibernate.property column="cough"
  */
    public Byte getField1495() {
        return this.field1495;
    }

    public void setField1495(Byte field1495) {
        this.field1495 = field1495;
    }





 /**
  * @return
  * @hibernate.property column="other_reasons"
  */
    public Byte getField1260() {
        return this.field1260;
    }

    public void setField1260(Byte field1260) {
        this.field1260 = field1260;
    }





 /**
  * @return
  * @hibernate.property column="reasons_other_describe" type="text"
  */
    public String getField1496() {
        return this.field1496;
    }

    public void setField1496(String field1496) {
        this.field1496 = field1496;
    }





 /**
  * @return
  * @hibernate.property column="comments_reasons_for_eval" type="text"
  */
    public String getField1759() {
        return this.field1759;
    }

    public void setField1759(String field1759) {
        this.field1759 = field1759;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_system_167"
  */
    public Integer getField167() {
        return this.field167;
    }

    public void setField167(Integer field167) {
        this.field167 = field167;
    }





 /**
  * @return
  * @hibernate.property column="respiratory_system_other" type="text"
  */
    public String getField1449() {
        return this.field1449;
    }

    public void setField1449(String field1449) {
        this.field1449 = field1449;
    }





 /**
  * @return
  * @hibernate.property column="respiration_rate_269"
  */
    public Integer getField269() {
        return this.field269;
    }

    public void setField269(Integer field269) {
        this.field269 = field269;
    }





 /**
  * @return
  * @hibernate.property column="bp_systolic_224"
  */
    public Integer getField224() {
        return this.field224;
    }

    public void setField224(Integer field224) {
        this.field224 = field224;
    }





 /**
  * @return
  * @hibernate.property column="bp_diastolic_225"
  */
    public Integer getField225() {
        return this.field225;
    }

    public void setField225(Integer field225) {
        this.field225 = field225;
    }





 /**
  * @return
  * @hibernate.property column="pulse_171"
  */
    public Integer getField171() {
        return this.field171;
    }

    public void setField171(Integer field171) {
        this.field171 = field171;
    }





 /**
  * @return
  * @hibernate.property column="temperature_266"
  */
    public Float getField266() {
        return this.field266;
    }

    public void setField266(Float field266) {
        this.field266 = field266;
    }





 /**
  * @return
  * @hibernate.property column="height_159"
  */
    public Integer getField159() {
        return this.field159;
    }

    public void setField159(Integer field159) {
        this.field159 = field159;
    }





 /**
  * @return
  * @hibernate.property column="weight_228"
  */
    public Float getField228() {
        return this.field228;
    }

    public void setField228(Float field228) {
        this.field228 = field228;
    }





 /**
  * @return
  * @hibernate.property column="heent_161"
  */
    public Integer getField161() {
        return this.field161;
    }

    public void setField161(Integer field161) {
        this.field161 = field161;
    }





 /**
  * @return
  * @hibernate.property column="heent_abnorm_162" type="text"
  */
    public String getField162() {
        return this.field162;
    }

    public void setField162(String field162) {
        this.field162 = field162;
    }





 /**
  * @return
  * @hibernate.property column="thyroid_165"
  */
    public Integer getField165() {
        return this.field165;
    }

    public void setField165(Integer field165) {
        this.field165 = field165;
    }





 /**
  * @return
  * @hibernate.property column="breasts_166"
  */
    public Integer getField166() {
        return this.field166;
    }

    public void setField166(Integer field166) {
        this.field166 = field166;
    }





 /**
  * @return
  * @hibernate.property column="heart_169"
  */
    public Integer getField169() {
        return this.field169;
    }

    public void setField169(Integer field169) {
        this.field169 = field169;
    }





 /**
  * @return
  * @hibernate.property column="heart_other_170" type="text"
  */
    public String getField170() {
        return this.field170;
    }

    public void setField170(String field170) {
        this.field170 = field170;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_172"
  */
    public Integer getField172() {
        return this.field172;
    }

    public void setField172(Integer field172) {
        this.field172 = field172;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_abnormal_173" type="text"
  */
    public String getField173() {
        return this.field173;
    }

    public void setField173(String field173) {
        this.field173 = field173;
    }





 /**
  * @return
  * @hibernate.property column="skin_176"
  */
    public Integer getField176() {
        return this.field176;
    }

    public void setField176(Integer field176) {
        this.field176 = field176;
    }





 /**
  * @return
  * @hibernate.property column="skin_abnorm_177" type="text"
  */
    public String getField177() {
        return this.field177;
    }

    public void setField177(String field177) {
        this.field177 = field177;
    }





 /**
  * @return
  * @hibernate.property column="extremities_174"
  */
    public Integer getField174() {
        return this.field174;
    }

    public void setField174(Integer field174) {
        this.field174 = field174;
    }





 /**
  * @return
  * @hibernate.property column="extremities_abnormal_175" type="text"
  */
    public String getField175() {
        return this.field175;
    }

    public void setField175(String field175) {
        this.field175 = field175;
    }





 /**
  * @return
  * @hibernate.property column="lymph_nodes_178"
  */
    public Integer getField178() {
        return this.field178;
    }

    public void setField178(Integer field178) {
        this.field178 = field178;
    }





 /**
  * @return
  * @hibernate.property column="rectum_179"
  */
    public Integer getField179() {
        return this.field179;
    }

    public void setField179(Integer field179) {
        this.field179 = field179;
    }





 /**
  * @return
  * @hibernate.property column="rectum_abnormal_180" type="text"
  */
    public String getField180() {
        return this.field180;
    }

    public void setField180(String field180) {
        this.field180 = field180;
    }





 /**
  * @return
  * @hibernate.property column="vulva_181"
  */
    public Integer getField181() {
        return this.field181;
    }

    public void setField181(Integer field181) {
        this.field181 = field181;
    }





 /**
  * @return
  * @hibernate.property column="vulva_abnormal_182" type="text"
  */
    public String getField182() {
        return this.field182;
    }

    public void setField182(String field182) {
        this.field182 = field182;
    }





 /**
  * @return
  * @hibernate.property column="vagina_183"
  */
    public Integer getField183() {
        return this.field183;
    }

    public void setField183(Integer field183) {
        this.field183 = field183;
    }





 /**
  * @return
  * @hibernate.property column="vagina_abnormal_184" type="text"
  */
    public String getField184() {
        return this.field184;
    }

    public void setField184(String field184) {
        this.field184 = field184;
    }





 /**
  * @return
  * @hibernate.property column="cervix_185"
  */
    public Integer getField185() {
        return this.field185;
    }

    public void setField185(Integer field185) {
        this.field185 = field185;
    }





 /**
  * @return
  * @hibernate.property column="cervix_abnormal_186" type="text"
  */
    public String getField186() {
        return this.field186;
    }

    public void setField186(String field186) {
        this.field186 = field186;
    }





 /**
  * @return
  * @hibernate.property column="uterus_187"
  */
    public Integer getField187() {
        return this.field187;
    }

    public void setField187(Integer field187) {
        this.field187 = field187;
    }





 /**
  * @return
  * @hibernate.property column="uterus_size_in_days_188"
  */
    public Integer getField188() {
        return this.field188;
    }

    public void setField188(Integer field188) {
        this.field188 = field188;
    }





 /**
  * @return
  * @hibernate.property column="adnexa_189"
  */
    public Integer getField189() {
        return this.field189;
    }

    public void setField189(Integer field189) {
        this.field189 = field189;
    }





 /**
  * @return
  * @hibernate.property column="adnexa_abnormal_190" type="text"
  */
    public String getField190() {
        return this.field190;
    }

    public void setField190(String field190) {
        this.field190 = field190;
    }





 /**
  * @return
  * @hibernate.property column="varicosities_191"
  */
    public Integer getField191() {
        return this.field191;
    }

    public void setField191(Integer field191) {
        this.field191 = field191;
    }





 /**
  * @return
  * @hibernate.property column="teeth_163"
  */
    public Integer getField163() {
        return this.field163;
    }

    public void setField163(Integer field163) {
        this.field163 = field163;
    }





 /**
  * @return
  * @hibernate.property column="teeth_other_164" type="text"
  */
    public String getField164() {
        return this.field164;
    }

    public void setField164(String field164) {
        this.field164 = field164;
    }





 /**
  * @return
  * @hibernate.property column="cns_192"
  */
    public Integer getField1356() {
        return this.field1356;
    }

    public void setField1356(Integer field1356) {
        this.field1356 = field1356;
    }





 /**
  * @return
  * @hibernate.property column="time_of_exam_1175"
  */
    public Time getField1175() {
        return this.field1175;
    }

    public void setField1175(Time field1175) {
        this.field1175 = field1175;
    }





 /**
  * @return
  * @hibernate.property column="fundal_height_232"
  */
    public Integer getField232() {
        return this.field232;
    }

    public void setField232(Integer field232) {
        this.field232 = field232;
    }





 /**
  * @return
  * @hibernate.property column="lie_313"
  */
    public Integer getField313() {
        return this.field313;
    }

    public void setField313(Integer field313) {
        this.field313 = field313;
    }





 /**
  * @return
  * @hibernate.property column="presentation_314"
  */
    public Integer getField314() {
        return this.field314;
    }

    public void setField314(Integer field314) {
        this.field314 = field314;
    }





 /**
  * @return
  * @hibernate.property column="presentation_other" type="text"
  */
    public String getField1508() {
        return this.field1508;
    }

    public void setField1508(String field1508) {
        this.field1508 = field1508;
    }





 /**
  * @return
  * @hibernate.property column="descent_315"
  */
    public Integer getField315() {
        return this.field315;
    }

    public void setField315(Integer field315) {
        this.field315 = field315;
    }





 /**
  * @return
  * @hibernate.property column="contraction_strength_316"
  */
    public Integer getField316() {
        return this.field316;
    }

    public void setField316(Integer field316) {
        this.field316 = field316;
    }





 /**
  * @return
  * @hibernate.property column="contraction_freq_10_abd_palp_317"
  */
    public Integer getField317() {
        return this.field317;
    }

    public void setField317(Integer field317) {
        this.field317 = field317;
    }





 /**
  * @return
  * @hibernate.property column="foetal_heart_rate_abd_palp_318"
  */
    public Integer getField318() {
        return this.field318;
    }

    public void setField318(Integer field318) {
        this.field318 = field318;
    }





 /**
  * @return
  * @hibernate.property column="time_320"
  */
    public Time getField320() {
        return this.field320;
    }

    public void setField320(Time field320) {
        this.field320 = field320;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_date_328"
  */
    public Date getField328() {
        return this.field328;
    }

    public void setField328(Date field328) {
        this.field328 = field328;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_time_329"
  */
    public Time getField329() {
        return this.field329;
    }

    public void setField329(Time field329) {
        this.field329 = field329;
    }





 /**
  * @return
  * @hibernate.property column="presentation_obtained_by_335"
  */
    public Integer getField335() {
        return this.field335;
    }

    public void setField335(Integer field335) {
        this.field335 = field335;
    }





 /**
  * @return
  * @hibernate.property column="condition_of_vulva_321"
  */
    public Integer getField321() {
        return this.field321;
    }

    public void setField321(Integer field321) {
        this.field321 = field321;
    }





 /**
  * @return
  * @hibernate.property column="condition_of_vulva_desc_322" type="text"
  */
    public String getField322() {
        return this.field322;
    }

    public void setField322(String field322) {
        this.field322 = field322;
    }





 /**
  * @return
  * @hibernate.property column="condition_of_vagina_323"
  */
    public Integer getField323() {
        return this.field323;
    }

    public void setField323(Integer field323) {
        this.field323 = field323;
    }





 /**
  * @return
  * @hibernate.property column="condition_of_vagina_other_324" type="text"
  */
    public String getField324() {
        return this.field324;
    }

    public void setField324(String field324) {
        this.field324 = field324;
    }





 /**
  * @return
  * @hibernate.property column="cervix_dilatation325"
  */
    public Integer getField325() {
        return this.field325;
    }

    public void setField325(Integer field325) {
        this.field325 = field325;
    }





 /**
  * @return
  * @hibernate.property column="cervix_effacement_326"
  */
    public Integer getField326() {
        return this.field326;
    }

    public void setField326(Integer field326) {
        this.field326 = field326;
    }





 /**
  * @return
  * @hibernate.property column="cervix_consistency_327"
  */
    public Integer getField327() {
        return this.field327;
    }

    public void setField327(Integer field327) {
        this.field327 = field327;
    }





 /**
  * @return
  * @hibernate.property column="membranes_re_330"
  */
    public Integer getField330() {
        return this.field330;
    }

    public void setField330(Integer field330) {
        this.field330 = field330;
    }





 /**
  * @return
  * @hibernate.property column="liquor_331"
  */
    public Integer getField331() {
        return this.field331;
    }

    public void setField331(Integer field331) {
        this.field331 = field331;
    }





 /**
  * @return
  * @hibernate.property column="station_of_pp_336"
  */
    public Integer getField336() {
        return this.field336;
    }

    public void setField336(Integer field336) {
        this.field336 = field336;
    }









 /**
  * @return
  * @hibernate.property column="moulding_338"
  */
    public Integer getField338() {
        return this.field338;
    }

    public void setField338(Integer field338) {
        this.field338 = field338;
    }





 /**
  * @return
  * @hibernate.property column="caput_339"
  */
    public Integer getField339() {
        return this.field339;
    }

    public void setField339(Integer field339) {
        this.field339 = field339;
    }





 /**
  * @return
  * @hibernate.property column="cord_at_vaginal_exam_340"
  */
    public Integer getField340() {
        return this.field340;
    }

    public void setField340(Integer field340) {
        this.field340 = field340;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes_1221"
  */
    public Byte getField1221() {
        return this.field1221;
    }

    public void setField1221(Byte field1221) {
        this.field1221 = field1221;
    }





 /**
  * @return
  * @hibernate.property column="diagonal_conjugate_342"
  */
    public Integer getField342() {
        return this.field342;
    }

    public void setField342(Integer field342) {
        this.field342 = field342;
    }





 /**
  * @return
  * @hibernate.property column="diagonal_conjugate_length_343"
  */
    public Integer getField343() {
        return this.field343;
    }

    public void setField343(Integer field343) {
        this.field343 = field343;
    }





 /**
  * @return
  * @hibernate.property column="ishcial_spines_344"
  */
    public Integer getField344() {
        return this.field344;
    }

    public void setField344(Integer field344) {
        this.field344 = field344;
    }





 /**
  * @return
  * @hibernate.property column="sub_pubic_arch_345"
  */
    public Integer getField345() {
        return this.field345;
    }

    public void setField345(Integer field345) {
        this.field345 = field345;
    }





 /**
  * @return
  * @hibernate.property column="curvature_of_sacrum_346"
  */
    public Integer getField346() {
        return this.field346;
    }

    public void setField346(Integer field346) {
        this.field346 = field346;
    }





 /**
  * @return
  * @hibernate.property column="intertuberous_diameter_347"
  */
    public Integer getField347() {
        return this.field347;
    }

    public void setField347(Integer field347) {
        this.field347 = field347;
    }





 /**
  * @return
  * @hibernate.property column="adequacy_of_pelvic_348"
  */
    public Integer getField348() {
        return this.field348;
    }

    public void setField348(Integer field348) {
        this.field348 = field348;
    }





 /**
  * @return
  * @hibernate.property column="pubic_arch_angle_349"
  */
    public Integer getField349() {
        return this.field349;
    }

    public void setField349(Integer field349) {
        this.field349 = field349;
    }





 /**
  * @return
  * @hibernate.property column="false_labour"
  */
    public Boolean getField1261() {
        return this.field1261;
    }

    public void setField1261(Boolean field1261) {
        this.field1261 = field1261;
    }





 /**
  * @return
  * @hibernate.property column="true_labor"
  */
    public Boolean getField1262() {
        return this.field1262;
    }

    public void setField1262(Boolean field1262) {
        this.field1262 = field1262;
    }





 /**
  * @return
  * @hibernate.property column="rupture_of_membranes"
  */
    public Boolean getField1263() {
        return this.field1263;
    }

    public void setField1263(Boolean field1263) {
        this.field1263 = field1263;
    }





 /**
  * @return
  * @hibernate.property column="preeclamp_hypert_1265"
  */
    public Boolean getField1265() {
        return this.field1265;
    }

    public void setField1265(Boolean field1265) {
        this.field1265 = field1265;
    }





 /**
  * @return
  * @hibernate.property column="premature_labour"
  */
    public Boolean getField1360() {
        return this.field1360;
    }

    public void setField1360(Boolean field1360) {
        this.field1360 = field1360;
    }





 /**
  * @return
  * @hibernate.property column="malaria_diag"
  */
    public Boolean getField1497() {
        return this.field1497;
    }

    public void setField1497(Boolean field1497) {
        this.field1497 = field1497;
    }





 /**
  * @return
  * @hibernate.property column="anaemia"
  */
    public Boolean getField1270() {
        return this.field1270;
    }

    public void setField1270(Boolean field1270) {
        this.field1270 = field1270;
    }





 /**
  * @return
  * @hibernate.property column="high_bp_diag"
  */
    public Boolean getField1499() {
        return this.field1499;
    }

    public void setField1499(Boolean field1499) {
        this.field1499 = field1499;
    }





 /**
  * @return
  * @hibernate.property column="vaginal_bleeding_diag"
  */
    public Boolean getField1500() {
        return this.field1500;
    }

    public void setField1500(Boolean field1500) {
        this.field1500 = field1500;
    }





 /**
  * @return
  * @hibernate.property column="intrauterine_death"
  */
    public Boolean getField1501() {
        return this.field1501;
    }

    public void setField1501(Boolean field1501) {
        this.field1501 = field1501;
    }





 /**
  * @return
  * @hibernate.property column="uti_diag"
  */
    public Boolean getField1502() {
        return this.field1502;
    }

    public void setField1502(Boolean field1502) {
        this.field1502 = field1502;
    }





 /**
  * @return
  * @hibernate.property column="pneumonia_diag"
  */
    public Boolean getField1503() {
        return this.field1503;
    }

    public void setField1503(Boolean field1503) {
        this.field1503 = field1503;
    }





 /**
  * @return
  * @hibernate.property column="tb_diag"
  */
    public Boolean getField1504() {
        return this.field1504;
    }

    public void setField1504(Boolean field1504) {
        this.field1504 = field1504;
    }





 /**
  * @return
  * @hibernate.property column="vaginal_thrush_diag"
  */
    public Boolean getField1505() {
        return this.field1505;
    }

    public void setField1505(Boolean field1505) {
        this.field1505 = field1505;
    }





 /**
  * @return
  * @hibernate.property column="oral_thrush_diag"
  */
    public Boolean getField1506() {
        return this.field1506;
    }

    public void setField1506(Boolean field1506) {
        this.field1506 = field1506;
    }





 /**
  * @return
  * @hibernate.property column="eclampsia"
  */
    public Byte getField1756() {
        return this.field1756;
    }

    public void setField1756(Byte field1756) {
        this.field1756 = field1756;
    }





 /**
  * @return
  * @hibernate.property column="abruptia_placenta"
  */
    public Boolean getField1757() {
        return this.field1757;
    }

    public void setField1757(Boolean field1757) {
        this.field1757 = field1757;
    }





 /**
  * @return
  * @hibernate.property column="miscarriage"
  */
    public Integer getField1758() {
        return this.field1758;
    }

    public void setField1758(Integer field1758) {
        this.field1758 = field1758;
    }





 /**
  * @return
  * @hibernate.property column="latent_labour"
  */
    public Boolean getField1932() {
        return this.field1932;
    }

    public void setField1932(Boolean field1932) {
        this.field1932 = field1932;
    }





 /**
  * @return
  * @hibernate.property column="cns_normal"
  */
    public Boolean getField1933() {
        return this.field1933;
    }

    public void setField1933(Boolean field1933) {
        this.field1933 = field1933;
    }





 /**
  * @return
  * @hibernate.property column="ante_maternal_death"
  */
    public Byte getField2139() {
        return this.field2139;
    }

    public void setField2139(Byte field2139) {
        this.field2139 = field2139;
    }





 /**
  * @return
  * @hibernate.property column="diag_other" type="text"
  */
    public String getField1359() {
        return this.field1359;
    }

    public void setField1359(String field1359) {
        this.field1359 = field1359;
    }





 /**
  * @return
  * @hibernate.property column="phase"
  */
    public Integer getField1487() {
        return this.field1487;
    }

    public void setField1487(Integer field1487) {
        this.field1487 = field1487;
    }





 /**
  * @return
  * @hibernate.property column="disposition_labor"
  */
    public Integer getField1266() {
        return this.field1266;
    }

    public void setField1266(Integer field1266) {
        this.field1266 = field1266;
    }





 /**
  * @return
  * @hibernate.property column="disp_ante"
  */
    public Integer getField1507() {
        return this.field1507;
    }

    public void setField1507(Integer field1507) {
        this.field1507 = field1507;
    }





 /**
  * @return
  * @hibernate.property column="type_of_labour"
  */
    public Integer getField1755() {
        return this.field1755;
    }

    public void setField1755(Integer field1755) {
        this.field1755 = field1755;
    }





 /**
  * @return
  * @hibernate.property column="uth_ward"
  */
    public Integer getField1841() {
        return this.field1841;
    }

    public void setField1841(Integer field1841) {
        this.field1841 = field1841;
    }





 /**
  * @return
  * @hibernate.property column="priority_of_referral"
  */
    public Integer getField1349() {
        return this.field1349;
    }

    public void setField1349(Integer field1349) {
        this.field1349 = field1349;
    }





 /**
  * @return
  * @hibernate.property column="transport"
  */
    public Integer getField1620() {
        return this.field1620;
    }

    public void setField1620(Integer field1620) {
        this.field1620 = field1620;
    }





 /**
  * @return
  * @hibernate.property column="treatment_1463" type="text"
  */
    public String getField1463() {
        return this.field1463;
    }

    public void setField1463(String field1463) {
        this.field1463 = field1463;
    }





 /**
  * @return
  * @hibernate.property column="comments_ante_prob_1464" type="text"
  */
    public String getField1464() {
        return this.field1464;
    }

    public void setField1464(String field1464) {
        this.field1464 = field1464;
    }





}