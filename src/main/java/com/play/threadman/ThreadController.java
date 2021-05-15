/**
 * @author eddeveloper <ed.developer90@gmail.com>
 * Date :  2021-05-15
 * Time : 11:57 AM
 */
package com.play.threadman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("thread")
public class ThreadController {
    @Autowired
    private ThreadService threadService;

    @GetMapping("/info")
    public ResponseEntity<?> info() {
        return ResponseEntity.ok(threadService.info());
    }

    @GetMapping("/add")
    public ResponseEntity<?> up(@RequestParam Integer sleep,
                                @RequestParam String origin,
                                @RequestParam String dest) {
        if (origin == null || dest == null || sleep == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("need origin and dest and sleep param");
        return ResponseEntity.ok(threadService.add(origin, dest, sleep));
    }

    @GetMapping("/rm")
    public ResponseEntity<?> down(@RequestParam Integer tid) {
        if (tid == null)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("need tid");
        return ResponseEntity.ok(threadService.rm(tid));
    }
}
