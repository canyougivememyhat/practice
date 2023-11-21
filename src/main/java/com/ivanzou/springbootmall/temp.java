package com.ivanzou.springbootmall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class temp {
//    @Override
//    public List<Map<String, Object>> getVideos(List<Integer> topicId, List<Integer> examTypeId, List<Integer> videoTypeId, VideoSort sortby, Integer page, Integer size) {
//        String sql = """
//                SELECT * FROM(
//                    SELECT  rownum rn, r.* from (
//                        SELECT y.*
//                        FROM youtube_url y
//                        LEFT JOIN youtube_subject_type
//                        ON y.youtube_subject_type_id = youtube_subject_type.id
//                        LEFT JOIN youtube_video_type_link
//                        ON y.id = youtube_video_type_link.youtube_url_id
//                        LEFT JOIN youtube_video_type
//                        ON youtube_video_type_link.youtube_video_type_id = youtube_video_type.id
//                        LEFT JOIN youtube_url_category_link
//                        ON y.id = youtube_url_category_link.youtube_url_id
//                        LEFT JOIN ts_pc
//                        ON youtube_url_category_link.ts_pc1 = ts_pc.ts_pc_id
//                """;
//
//        Map<String, Object> params = new HashMap<>();
//        params.put("upId", TkbGoCode.YOUTUBE_URL.getUpId());
//        params.put("size", size);
//        params.put("page", page);
//        int pageStart = page * size + 1;
//        int pageEnd = page * (size + 1);
//        params.put("pageStart", pageStart);
//        params.put("pageEnd", pageEnd);
//
//        if(topicId != null || videoTypeId != null || examTypeId != null){
//            sql += " WHERE open = 0 AND(";
//            boolean flag = false;
//            // 第一個成立的條件前面不加 OR，第二個之後的才要
//            if(topicId != null ){
//                sql += " youtube_subject_type.id IN (:topicId)";
//                params.put("topicId", topicId);
//                flag = true;
//            }
//            if(videoTypeId != null && !flag){
//                sql += " youtube_video_type.id IN (:videoTypeId)";
//                params.put("videoTypeId", videoTypeId);
//                flag = true;
//            }else if(videoTypeId != null){
//                sql += " OR youtube_video_type.id IN (:videoTypeId)";
//                params.put("videoTypeId", videoTypeId);
//            }
//            if(examTypeId != null && !flag){
//                sql += " (ts_pc.ts_pc_id IN (:examTypeId) AND ts_pc.ts_up_pc_id = (:upId))";
//                params.put("examTypeId", examTypeId);
//                flag = true;
//            }else if(examTypeId != null){
//                sql += " OR (ts_pc.ts_pc_id IN (:examTypeId) AND ts_pc.ts_up_pc_id = (:upId))";
//                params.put("examTypeId", examTypeId);
//            }
//            sql += ")";
//        }
//
//        switch(sortby){
//            case NEWEST:
//                sql += " ORDER BY y.create_date DESC, y.viewed DESC, y.id DESC";
//                break;
//            case OLDEST:
//                sql += " ORDER BY y.create_date ASC, y.viewed DESC, y.id DESC";
//                break;
//            case POPULAR:
//                sql += " ORDER BY y.viewed DESC, y.create_date DESC, y.id DESC";
//                break;
//        }
//
//        sql += """
//                ) r
//                WHERE rownum <= :pageEnd
//            ) a
//        WHERE a.rn >= :pageStart
//        """;
//
//
//
//        return namedParameterJdbcTemplate.queryForList(sql, params);
//    }
}
